package HotelChain;

import HotelChain.Exceptions.NoExistChoiceException;
import HotelChain.Hotel.Branch;
import HotelChain.Hotel.Hotel;
import HotelChain.Hotel.HotelRoom;
import HotelChain.Interfaces.ConsoleFunctional;
import HotelChain.Interfaces.Menu;
import HotelChain.Persons.Client;
import HotelChain.Persons.Employee;

import java.util.*;

public class HotelChain implements Menu {
    private List<Branch> branches = new ArrayList<>();
    private List<Hotel> hotels = new ArrayList<>();
    private List<HotelRoom> hotelRooms = new ArrayList<>();
    private List<Client> clients = new LinkedList<>();
    private List<Employee> employees = new LinkedList<>();

    public HotelChain() {
        Reader.readBranches(branches);
        Reader.readHotels(hotels);
        Reader.readRooms(hotelRooms);
        Reader.readClient(clients);
        Reader.readEmployee(employees);
        initialize();
    }

    public HotelChain(List<Branch> branches, List<Hotel> hotels, List<HotelRoom> hotelRooms, List<Client> clients,
                      List<Employee> employees) {
        this.branches = branches;
        this.hotels = hotels;
        this.hotelRooms = hotelRooms;
        this.clients = clients;
        this.employees = employees;
    }

    public List<Branch> getBranches() {
        return branches;
    }

    public void setBranches(List<Branch> branches) {
        this.branches = branches;
    }

    public List<Client> getClients() {
        return clients;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public void initialize() {
        for (Hotel hotel : hotels) {
            hotel.setRooms(hotelRooms);
        }


        Random random = new Random(new Date().getTime());
        int startIdx = random.nextInt(hotels.size() / 2 - 1);
        int endIdx;
        do {
            endIdx = random.nextInt(hotels.size());
        } while (endIdx <= startIdx + 2);
        for (Branch branch : branches) {
            branch.setHotels(hotels.subList(startIdx, endIdx));
        }
    }

    @Override
    public void realizeMenu() {
        do {
            displayMenuList();
        } while (realizeChoice(readChoice()));
    }

    @Override
    public void displayMenuList() {
        System.out.print(ConsoleFunctional.BLUE_BOLD_BRIGHT + """
                ============================= Menu =============================
                [1] -> display info about branches
                [2] -> display info about all hotels
                [3] -> display info about all hotel rooms
                [4] -> display info about clients
                [5] -> display info about employees
                [6] -> add new client
                [7] -> remove a client
                [8] -> add new employee
                [9] -> remove an employee
                [10] -> offer a room to a client
                [11] -> show all offered rooms
                """ + ConsoleFunctional.RESET);
    }

    @Override
    public boolean realizeChoice(int choice) {
        try {
            switch (choice) {
                case 0 -> {
                    System.out.println("You have finished successfully");
                    return false;
                }
                case 1 -> branches.forEach(System.out::println);
                case 2 -> hotels.forEach(System.out::println);
                case 3 -> hotelRooms.forEach(System.out::println);
                case 4 -> clients.forEach(System.out::println);
                case 5 -> employees.forEach(System.out::println);
                case 6 -> addClient();
                case 7 ->
                        removeClient(Reader.readFirstName(), Reader.readLastName());
                case 8 -> addEmployee();
                case 9 ->
                        removeEmployee(Reader.readFirstName(), Reader.readLastName());
                case 10 -> offerRoom();
                case 11 -> showOfferedRooms();
                default -> throw new NoExistChoiceException();
            }
        } catch (NoExistChoiceException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("\n\n");
        return true;
    }

    @Override
    public int readChoice() {
        System.out.print("Your choice -> ");
        return ConsoleFunctional.scanner.nextInt();
    }

    private void addClient() {
        String firstName = Reader.readFirstName();
        String lastName = Reader.readLastName();

        String personalCode;
        while (true) {
            System.out.print("Enter personal code: ");
            personalCode = ConsoleFunctional.scanner.next();
            if (personalCode.length() != 13) {
                System.out.println("Personal code must be 13 digits long\n");
            } else if (!personalCode.matches("[0-9]+")) {
                System.out.println("Personal code must contain only numbers\n");
            } else {
                break;
            }
        }

        System.out.print("Enter the home address(split word or numbers by \"_\"): ");
        String address = ConsoleFunctional.scanner.next().replace("_", " ");

        String phoneNumber;
        while (true) {
            System.out.print("Enter phone number: ");
            phoneNumber = ConsoleFunctional.scanner.next();
            if (phoneNumber.length() != 9) {
                System.out.println("Phone number must be 9 digits long\n");
            } else if (!phoneNumber.matches("[0-9]+")) {
                System.out.println("Phone number must contain only number\n");
            } else {
                break;
            }
        }

        clients.add(new Client(firstName, lastName, personalCode, address,
                phoneNumber));
    }

    private void addEmployee() {
        String firstName = Reader.readFirstName();
        String lastName = Reader.readLastName();

        String personalCode;
        while (true) {
            System.out.print("Enter personal code: ");
            personalCode = ConsoleFunctional.scanner.next();
            if (personalCode.length() != 13) {
                System.out.println("Personal code must be 13 digits long\n");
            } else if (!personalCode.matches("[0-9]+")) {
                System.out.println("Personal code must contain only numbers\n");
            } else {
                break;
            }
        }

        System.out.print("Enter the home address(split word or numbers by \"_\"): ");
        String address = ConsoleFunctional.scanner.next().replace("_", " ");

        String phoneNumber;
        while (true) {
            System.out.print("Enter phone number: ");
            phoneNumber = ConsoleFunctional.scanner.next();
            if (phoneNumber.length() != 9) {
                System.out.println("Phone number must be 9 digits long\n");
            } else if (!phoneNumber.matches("[0-9]+")) {
                System.out.println("Phone number must contain only number\n");
            } else {
                break;
            }
        }

        System.out.print("Enter the function: ");
        String function = ConsoleFunctional.scanner.next();

        System.out.print("Enter the salary: ");
        int salary = ConsoleFunctional.scanner.nextInt();

        employees.add(new Employee(firstName, lastName, personalCode,
                address, phoneNumber, function, salary));
    }

    private void removeEmployee(String firstName, String lastName) {
        employees.removeIf(employee -> employee.getFirstName().equals(firstName)
                && employee.getLastName().equals(lastName));
    }

    private void removeClient(String firstName, String lastName) {
        clients.removeIf(client -> client.getFirstName().equals(firstName)
                && client.getLastName().equals(lastName));
    }

    private void offerRoom() {
        findHotel().offerRoom(findClient());
    }

    private void showOfferedRooms() {
        for (Hotel hotel : hotels) {
            System.out.println(ConsoleFunctional.CYAN_BOLD_BRIGHT
                    + hotel.getName() + ConsoleFunctional.RESET);
            hotel.showOfferedRooms();
        }
    }

    public Hotel findHotel() {
        hotels.forEach(System.out::println);
        String name = Reader.readHotelName();
        for (Hotel hotel : hotels) {
            if (hotel.getName().equals(name)) {
                return hotel;
            }
        }
        return hotels.get(0);
    }

    private Client findClient() {
        clients.forEach(System.out::println);
        String firstName = Reader.readFirstName();
        String lastName = Reader.readLastName();
        for (Client client : clients) {
            if (client.getFirstName().equals(firstName)
                    && client.getLastName().equals(lastName)) {
                return client;
            }
        }
        return clients.get(0);
    }

}

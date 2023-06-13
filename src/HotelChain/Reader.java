package HotelChain;

import HotelChain.Hotel.Branch;
import HotelChain.Hotel.Hotel;
import HotelChain.Hotel.HotelRoom;
import HotelChain.Interfaces.ConsoleFunctional;
import HotelChain.Persons.Client;
import HotelChain.Persons.Employee;

import java.io.IOException;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class Reader {
    public static LocalDate readDate() {
        System.out.print("Day: ");
        int day;
        do {
            day = ConsoleFunctional.scanner.nextInt();
        } while (day < 1 || day > 30);
        System.out.print("Month: ");
        int month;
        do {
            month = ConsoleFunctional.scanner.nextInt();
        } while (month < 1 || month > 12);
        System.out.print("Year: ");
        int year = ConsoleFunctional.scanner.nextInt();
        return LocalDate.of(year, month, day);
    }

    public static void readBranches(List<Branch> branches) {
        try {
            Scanner scanner = new Scanner(Path.of("src/HotelChain/InputData/Branch.txt"));
            while (scanner.hasNextLine()) {
                branches.add(new Branch(
                        scanner.next(),
                        scanner.next(),
                        scanner.next()
                ));
            }
            scanner.close();
            System.out.println(ConsoleFunctional.GREEN_BOLD_BRIGHT +
                    "File Branch.txt has been read successfully" + ConsoleFunctional.RESET);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readHotels(List<Hotel> hotels) {
        try {
            Scanner scanner = new Scanner(Path.of("src/HotelChain/InputData/Hotel.txt"));
            while (scanner.hasNextLine()) {
                hotels.add(new Hotel(
                        scanner.next(),
                        scanner.next(),
                        scanner.next(),
                        scanner.next(),
                        scanner.next(),
                        scanner.nextInt()
                ));
            }
            scanner.close();
            System.out.println(ConsoleFunctional.GREEN_BOLD_BRIGHT +
                    "File Hotel.txt has been read successfully" + ConsoleFunctional.RESET);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String readHotelName() {
        System.out.print("Enter the hotel name: ");
        return ConsoleFunctional.scanner.next();
    }

    public static void readRooms(List<HotelRoom> hotelRooms) {
        try {
            Scanner scanner = new Scanner(Path.of("src/HotelChain/InputData/HotelRoom.txt"));
            while (scanner.hasNextLine()) {
                hotelRooms.add(new HotelRoom(
                        scanner.nextInt(),
                        scanner.nextInt(),
                        scanner.nextInt(),
                        scanner.next(),
                        scanner.nextInt()
                ));
            }
            scanner.close();
            System.out.println(ConsoleFunctional.GREEN_BOLD_BRIGHT +
                    "File HotelRoom.txt has been read successfully" + ConsoleFunctional.RESET);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static int readRoomOrderNumber() {
        System.out.print("Enter room order number: ");
        return ConsoleFunctional.scanner.nextInt();
    }

    public static void readEmployee(List<Employee> employees) {
        try {
            Scanner scanner = new Scanner(Path.of("src/HotelChain/InputData/Employee.txt"));
            while (scanner.hasNextLine()) {
                employees.add(new Employee(
                        scanner.next(),
                        scanner.next(),
                        scanner.next(),
                        scanner.next(),
                        scanner.next(),
                        scanner.next(),
                        scanner.nextInt()
                ));
            }
            scanner.close();
            System.out.println(ConsoleFunctional.GREEN_BOLD_BRIGHT +
                    "File Employee.txt has been read successfully" + ConsoleFunctional.RESET);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void readClient(List<Client> clients) {
        try {
            Scanner scanner = new Scanner(Path.of("src/HotelChain/InputData/Client.txt"));
            while (scanner.hasNextLine()) {
                clients.add(new Client(
                        scanner.next(),
                        scanner.next(),
                        scanner.next(),
                        scanner.next(),
                        scanner.next()
                ));
            }
            scanner.close();
            System.out.println(ConsoleFunctional.GREEN_BOLD_BRIGHT +
                    "File Client.txt has been read successfully" + ConsoleFunctional.RESET);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static String readFirstName() {
        System.out.print("Enter first name: ");
        return ConsoleFunctional.scanner.next();
    }

    public static String readLastName() {
        System.out.print("Enter last name: ");
        return ConsoleFunctional.scanner.next();
    }
}

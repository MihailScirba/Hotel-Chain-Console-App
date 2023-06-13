package HotelChain.Hotel;

import HotelChain.Exceptions.IsOccupiedRoomException;
import HotelChain.Interfaces.ConsoleFunctional;
import HotelChain.Persons.Client;
import HotelChain.Reader;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Hotel {
    private String name;
    private String address;
    private String phoneNumber;
    private String classification;
    private String type;
    private int score;
    private List<HotelRoom> hotelRooms;
    private Map<HotelRoom, Client> offeredRooms = new HashMap<>();

    public Hotel() {
        this.name = "not specified";
        this.address = "not specified";
        this.phoneNumber = "not specified";
        this.classification = "not specified";
        this.type = "not specified";
        this.score = 0;
        this.hotelRooms = new ArrayList<>();
    }

    public Hotel(String name, String address, String phoneNumber, String classification,
                 String type, int score) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.classification = classification;
        this.type = type;
        this.score = score;
        this.hotelRooms = new ArrayList<>();
    }

    public Hotel(String name, String address, String phoneNumber, String classification,
                 String type, int score, List<HotelRoom> hotelRooms) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.classification = classification;
        this.type = type;
        this.score = score;
        this.hotelRooms = hotelRooms;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public List<HotelRoom> getRooms() {
        return hotelRooms;
    }

    public void setRooms(List<HotelRoom> hotelRooms) {
        this.hotelRooms = hotelRooms;
    }

    public void showRooms() {
        System.out.println("Rooms: \n" + hotelRooms.toString().replace("},", "\n"));
    }

    public void showOfferedRooms() {
        for (HotelRoom hotelRoom : offeredRooms.keySet()) {
            System.out.println(hotelRoom + "\n\t" + offeredRooms.get(hotelRoom).showInfo() + "\n\n");
        }
    }

    public void offerRoom(Client client) {
        HotelRoom hotelRoom = findRoom();

        System.out.println("\nEnter check-in date:");
        LocalDate checkInDate = Reader.readDate();

        System.out.print("Enter the length of stay in days: ");
        int periodDays = ConsoleFunctional.scanner.nextInt();

        if (offeredRooms.containsKey(hotelRoom)) {
            try {
                if (checkInDate.isBefore(offeredRooms.get(hotelRoom).getCheckOut())) {
                    throw new IsOccupiedRoomException();
                }
                client.setPeriod(checkInDate, periodDays);
                offeredRooms.replace(hotelRoom, client);
            } catch (IsOccupiedRoomException e) {
                System.out.println(e.getMessage());
            }
        } else {
            client.setPeriod(checkInDate, periodDays);
            offeredRooms.put(hotelRoom, client);
        }
    }

    private HotelRoom findRoom() {
        showRooms();
        int orderNumber = Reader.readRoomOrderNumber();
        for (HotelRoom hotelRoom : hotelRooms) {
            if (hotelRoom.getOrderNumber() == orderNumber) {
                return hotelRoom;
            }
        }
        return hotelRooms.get(0);
    }


    @Override
    public String toString() {
        return "Hotel{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", classification='" + classification + '\'' +
                ", type='" + type + '\'' +
                ", score=" + score +
                ", numberOfRooms: " + hotelRooms.size() +
                '}';
    }
}

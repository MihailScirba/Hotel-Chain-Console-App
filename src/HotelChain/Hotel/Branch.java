package HotelChain.Hotel;

import java.util.ArrayList;
import java.util.List;

public class Branch {
    private String name;
    private String address;
    private String phoneNumber;
    private List<Hotel> hotels;

    public Branch() {
        this.name = "not specified";
        this.address = "not specified";
        this.phoneNumber = "not specified";
        hotels = new ArrayList<>();
    }

    public Branch(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.hotels = new ArrayList<>();
    }

    public Branch(String name, String address, String phoneNumber, List<Hotel> hotels) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.hotels = hotels;
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

    public List<Hotel> getHotels() {
        return hotels;
    }

    public void setHotels(List<Hotel> hotels) {
        this.hotels = hotels;
    }

    @Override
    public String toString() {
        return "Branch{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", numberOfHotels=" + hotels.size() +
                '}';
    }
}

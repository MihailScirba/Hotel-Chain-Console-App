package HotelChain.Persons;

import java.time.LocalDate;

public class Client extends Person {
    private LocalDate checkIn;
    private LocalDate checkOut;

    public Client() {
        this.firstName = "not specified";
        this.lastName = "not specified";
        this.personalCode = "not specified";
        this.phoneNumber = "not specified";
    }

    public Client(String firstName, String lastName, String personalCode,
                  String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.personalCode = personalCode;
        this.phoneNumber = phoneNumber;
    }

    public Client(String firstName, String lastName, String personalCode,
                  String homeAddress, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.personalCode = personalCode;
        this.homeAddress = homeAddress;
        this.phoneNumber = phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPersonalCode() {
        return personalCode;
    }

    public void setPersonalCode(String personalCode) {
        this.personalCode = personalCode;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public LocalDate getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(LocalDate checkIn) {
        this.checkIn = checkIn;
    }

    public LocalDate getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(LocalDate checkOut) {
        this.checkOut = checkOut;
    }

    public void setPeriod(LocalDate checkIn, int periodDays) {
        this.checkIn = checkIn;
        this.checkOut = checkIn.plusDays(periodDays);
    }

    @Override
    void showStatus() {
        System.out.println("I'm a client");
    }

    public String showInfo() {
        return this + "\n\t{checkIn=" + checkIn.getDayOfMonth() + "." +
                checkIn.getMonthValue() + "." +
                checkIn.getYear() +
                ", checkOut=" + checkOut.getDayOfMonth() + "." +
                checkOut.getMonthValue() + "." +
                checkOut.getYear() + "}\n\n";
    }
}

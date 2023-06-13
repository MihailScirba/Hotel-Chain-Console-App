package HotelChain.Persons;

public abstract class Person {
    protected String firstName;
    protected String lastName;
    protected String personalCode;
    protected String homeAddress;
    protected String phoneNumber;

    abstract void showStatus();

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", personalCode='" + personalCode + '\'' +
                ", homeAddress='" + homeAddress + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}

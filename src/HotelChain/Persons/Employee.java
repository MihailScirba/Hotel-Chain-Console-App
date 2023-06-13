package HotelChain.Persons;

public class Employee extends Person {
    private String function;
    private int salary;

    public Employee() {
        this.firstName = "not specified";
        this.lastName = "not specified";
        this.personalCode = "not specified";
        this.phoneNumber = "not specified";
        this.function = "not specified";
        this.salary = 0;
    }

    public Employee(String firstName, String lastName, String personalCode, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.personalCode = personalCode;
        this.phoneNumber = phoneNumber;
    }

    public Employee(String firstName, String lastName, String personalCode, String homeAddress,
                    String phoneNumber, String function, int salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.personalCode = personalCode;
        this.homeAddress = homeAddress;
        this.phoneNumber = phoneNumber;
        this.function = function;
        this.salary = salary;
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

    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    void showStatus() {
        System.out.println("I'm a employee");
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", personalCode='" + personalCode + '\'' +
                ", homeAddress='" + homeAddress + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", function='" + function + '\'' +
                ", salary=" + salary +
                '}';
    }
}

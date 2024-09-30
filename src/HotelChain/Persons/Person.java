package HotelChain.Persons;

import HotelChain.Interfaces.ConsoleFunctional;

public abstract class Person {
    protected String firstName;
    protected String lastName;
    protected String personalCode;
    protected String homeAddress;
    protected String phoneNumber;

    abstract void showStatus();

    @Override
    public String toString() {
        return getClass().getSimpleName() + " => "
                + ConsoleFunctional.GREEN_BOLD_BRIGHT + "firstname = "
                + ConsoleFunctional.RESET + "{" + firstName + "}, "
                + ConsoleFunctional.GREEN_BOLD_BRIGHT + "lastname = "
                + ConsoleFunctional.RESET + "{" + lastName + "}, "
                + ConsoleFunctional.GREEN_BOLD_BRIGHT + "personal code = "
                + ConsoleFunctional.RESET + "{" + personalCode + "}, "
                + ConsoleFunctional.GREEN_BOLD_BRIGHT + "home address = "
                + ConsoleFunctional.RESET + "{" + homeAddress + "}, "
                + ConsoleFunctional.GREEN_BOLD_BRIGHT + "phone number = "
                + ConsoleFunctional.RESET + "{" + phoneNumber + "}";
    }
}

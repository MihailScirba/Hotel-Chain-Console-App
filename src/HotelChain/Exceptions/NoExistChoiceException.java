package HotelChain.Exceptions;

import HotelChain.Interfaces.ConsoleFunctional;

public class NoExistChoiceException extends Exception {
    @Override
    public String getMessage() {
        return ConsoleFunctional.RED_BOLD_BRIGHT + "There's no such choice\n" + ConsoleFunctional.RESET;
    }
}

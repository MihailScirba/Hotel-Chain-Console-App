package HotelChain.Exceptions;

import HotelChain.Interfaces.ConsoleFunctional;

public class IsOccupiedRoomException extends Exception{
    @Override
    public String getMessage() {
        return ConsoleFunctional.RED_BOLD_BRIGHT + "This room is occupied\n" + ConsoleFunctional.RESET;
    }
}

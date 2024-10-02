package HotelChain.Hotel;

import HotelChain.Interfaces.ConsoleFunctional;

public class HotelRoom {
    private int orderNumber;
    private int nrRooms;
    private int nrSeats;
    private String comfort;
    private int dayPrice;

    public HotelRoom() {
        this.orderNumber = -1;
        this.nrRooms = -1;
        this.nrSeats = -1;
        this.comfort = "not specified";
        this.dayPrice = -1;
    }

    public HotelRoom(int orderNumber, int nrRooms, int nrSeats, int dayPrice) {
        this.orderNumber = orderNumber;
        this.nrRooms = nrRooms;
        this.nrSeats = nrSeats;
        this.dayPrice = dayPrice;
    }

    public HotelRoom(int orderNumber, int nrRooms, int nrSeats, String comfort,
                     int dayPrice) {
        this.orderNumber = orderNumber;
        this.nrRooms = nrRooms;
        this.nrSeats = nrSeats;
        this.comfort = comfort;
        this.dayPrice = dayPrice;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public int getNrRooms() {
        return nrRooms;
    }

    public void setNrRooms(int nrRooms) {
        this.nrRooms = nrRooms;
    }

    public int getNrSeats() {
        return nrSeats;
    }

    public void setNrSeats(int nrSeats) {
        this.nrSeats = nrSeats;
    }

    public String getComfort() {
        return comfort;
    }

    public void setComfort(String comfort) {
        this.comfort = comfort;
    }

    public int getDayPrice() {
        return dayPrice;
    }

    public void setDayPrice(int dayPrice) {
        this.dayPrice = dayPrice;
    }

    @Override
    public String toString() {
        return "Hotel room => "
                + ConsoleFunctional.GREEN_BOLD_BRIGHT + "order number = "
                + ConsoleFunctional.RESET + "{" + orderNumber + "}, "
                + ConsoleFunctional.GREEN_BOLD_BRIGHT + "nr of rooms = "
                + ConsoleFunctional.RESET + "{" + nrRooms + "}, "
                + ConsoleFunctional.GREEN_BOLD_BRIGHT + "nr seats = "
                + ConsoleFunctional.RESET + "{" + nrSeats + "}, "
                + ConsoleFunctional.GREEN_BOLD_BRIGHT + "day price = "
                + ConsoleFunctional.RESET + "{" + dayPrice + "}\n";
    }
}

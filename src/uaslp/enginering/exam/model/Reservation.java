package uaslp.enginering.exam.model;

public class Reservation {

    private int RoomNumber;
    private String ArrivalDate;
    private Guest Guest;
    private int Nights;

    public void setRoomNumber(int roomNumber) {
        RoomNumber = roomNumber;
    }

    public void setArrivalDate(String arrivalDate) {
        ArrivalDate = arrivalDate;
    }

    public void setGuest(Guest guest) {
        Guest = guest;
    }

    public void setNights(int nights) {
        Nights = nights;
    }

    public int getRoomNumber() {
        return RoomNumber;
    }

    public String getArrivalDate() {
        return ArrivalDate;
    }

    public uaslp.enginering.exam.model.Guest getGuest() {
        return Guest;
    }

    public int getNights() {
        return Nights;
    }

}

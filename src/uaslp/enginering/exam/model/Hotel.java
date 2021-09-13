package uaslp.enginering.exam.model;

import java.util.ArrayList;

public class Hotel {
    private ArrayList<Reservation> reservations;
    private String Name;
    private ArrayList<Room> Rooms;

    public Hotel(String nameHotel) {
        this.Name = nameHotel;
        reservations = new ArrayList<>();
        Rooms = new ArrayList<>();

    }

    public void reserveRoom(int roomNumber, Guest guest, String arrivalDate, int nights) {
        Reservation reservation = new Reservation();

        reservation.setRoomNumber(roomNumber);
        reservation.setArrivalDate(arrivalDate);
        reservation.setGuest(guest);
        reservation.setNights(nights);

        reservations.add(reservation);
    }

    public void addRoom(Room room){

        Rooms.add(room);

    }

    public ArrayList<Room> getRooms() { return Rooms; }

    public String getName() {
        return Name;
    }

    public ArrayList<Reservation> getReservations() { return reservations; }

}

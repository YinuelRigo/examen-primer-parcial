package uaslp.enginering.exam.model;


public class Room {

    private int Number;
    private String Size;
    private RoomStatus Status;

    public Room(int number, String size, RoomStatus status){

        this.Number = number;
        this.Size = size;
        this.Status = status;

    }

    public int getNumber() {
        return Number;
    }

    public void setNumber(int number) {
        Number = number;
    }

    public String getSize() {
        return Size;
    }

    public void setSize(String size) {
        Size = size;
    }

    public RoomStatus getStatus() {
        return Status;
    }

    public void setStatus(RoomStatus status) {
        Status = status;
    }
}

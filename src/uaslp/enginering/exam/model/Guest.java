package uaslp.enginering.exam.model;

public class Guest {

    private String Name;
    private String Address;
    private String Country;
    private String PhoneNumber;

    public void setName(String name) {
        Name = name;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public String getName() {
        return Name;
    }

    public String getAddress() {
        return Address;
    }

    public String getCountry() {
        return Country;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }
}

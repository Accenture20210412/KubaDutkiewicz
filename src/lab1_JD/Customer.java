package lab1_JD;

public class Customer {

    private String nameAndSurname;
    private String address;
    private Trip trip;

    public Customer(String nameAndSurname, String address, Trip trip) {
        this.nameAndSurname = nameAndSurname;
        this.address = address;
        this.trip = trip;
    }

    public Customer() {
    }

    public String getNameAndSurname() {
        return nameAndSurname;
    }

    public String getAddress() {
        return address;
    }

    public Trip getTrip() {
        return trip;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "nameAndSurname='" + nameAndSurname + '\'' +
                ", address='" + address + '\'' +
                ", trip=" + trip +
                '}';
    }
}

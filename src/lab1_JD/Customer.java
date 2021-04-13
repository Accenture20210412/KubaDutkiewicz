package lab1_JD;

import lab1_JD.trip.Trip;

public class Customer {

    private String firstName;
    private String lastName;
    private String address;
    private Trip trip;

    public Customer(String firstName, String lastName, String address, Trip trip) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.trip = trip;
    }

    public Customer(String firstName, String lastName, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    public Customer() {
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
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
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", trip=" + trip +
                '}';
    }
}

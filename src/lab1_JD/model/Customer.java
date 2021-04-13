package lab1_JD.model;

import lab1_JD.trip.Trip;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Customer)) return false;

        Customer customer = (Customer) o;

        if (!Objects.equals(firstName, customer.firstName)) return false;
        if (!Objects.equals(lastName, customer.lastName)) return false;
        if (!Objects.equals(address, customer.address)) return false;
        return Objects.equals(trip, customer.trip);
    }

    @Override
    public int hashCode() {
        int result = firstName != null ? firstName.hashCode() : 0;
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (trip != null ? trip.hashCode() : 0);
        return result;
    }
}

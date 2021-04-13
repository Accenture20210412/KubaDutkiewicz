package lab1_JD;

import lab1_JD.trip.AbroadTrip;
import lab1_JD.trip.DomesticTrip;
import lab1_JD.trip.Trip;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        TravelOffice travelOffice = new TravelOffice();

        Trip trip = new Trip(LocalDate.parse("2021-06-05"), LocalDate.parse("2021-06-14"), "Zakopane", new BigDecimal(1000));
        AbroadTrip abroadTrip = new AbroadTrip(LocalDate.parse("2021-07-01"), LocalDate.parse("2021-07-15"), "Barcelona", new BigDecimal(5000), new BigDecimal(500));
        DomesticTrip domesticTrip = new DomesticTrip(LocalDate.parse("2021-08-01"), LocalDate.parse("2021-08-15"), "Gdańsk", new BigDecimal(3000), new BigDecimal(1000));

        Customer customer1 = new Customer("Józef", "Nowak", "Katowice", trip);
        Customer customer2 = new Customer("Stefan", "Kowalski", "Kraków", abroadTrip);
        Customer customer3 = new Customer("Andrzej", "Lewandowski", "Gliwice", domesticTrip);

        travelOffice.addCustomer(customer1);
        travelOffice.addCustomer(customer2);
        travelOffice.addCustomer(customer3);

        System.out.println(travelOffice.getCustomersInfo());
    }
}

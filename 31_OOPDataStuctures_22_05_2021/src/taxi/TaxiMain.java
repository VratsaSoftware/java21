package taxi;

import taxi.models.Driver;
import taxi.models.Passenger;
import taxi.models.Range;
import taxi.models.Trip;

import java.util.ArrayList;
import java.util.List;

public class TaxiMain {

    public static void main(String[] args) {
        List<Driver> allDrivers = new ArrayList<>();
        List<Passenger> allPassengers = new ArrayList<>();
        List<Trip> trips = new ArrayList<>();

        Driver driver1 = new Driver("Driver1");
        Driver driver2 = new Driver("Driver2");

        allDrivers.add(driver1);
        allDrivers.add(driver2);

        Passenger passenger1 = new Passenger("Passenger1");
        Passenger passenger2 = new Passenger("Passenger2");
        Passenger passenger3 = new Passenger("Passenger3");

        allPassengers.add(passenger1);
        allPassengers.add(passenger2);
        allPassengers.add(passenger3);

        List<Passenger> listPassengers1 = new ArrayList<>();
        listPassengers1.add(passenger1);
        listPassengers1.add(passenger2);

        List<Passenger> listPassengers2 = new ArrayList<>();
        listPassengers1.add(passenger2);

        Trip trip1 = new Trip(driver1, listPassengers1, 15, 9);
        Trip trip2 = new Trip(driver2, listPassengers2, 6, 2);
        Trip trip3 = new Trip(driver1, listPassengers1, 10, 3);
        Trip trip4 = new Trip(driver1, listPassengers1, 22, 3);
        Trip trip5 = new Trip(driver1, listPassengers1, 23, 3);
        Trip trip6 = new Trip(driver1, listPassengers1, 29, 3);
        Trip trip7 = new Trip(driver1, listPassengers1, 19, 3);

        trips.add(trip1);
        trips.add(trip2);
        trips.add(trip3);
        trips.add(trip4);
        trips.add(trip5);
        trips.add(trip6);
        trips.add(trip7);

        TaxiPark park = new TaxiPark(allDrivers, allPassengers, trips);

//        List<Passenger> passengers = park.findAllPassengersWhoCompletedGivenNumberOfTrips(1);
//        for (Passenger p: passengers) {
//            System.out.println(p.getName());
//        }

//        List<Passenger> faithfulPassengers = park.findFrequentPassengers(driver1);
//        for (Passenger p: faithfulPassengers) {
//            System.out.println(p.getName());
//        }

        Range range = park.findTheMostFrequentTripDurationPeriod();
        System.out.println(range.toString());
    }


}

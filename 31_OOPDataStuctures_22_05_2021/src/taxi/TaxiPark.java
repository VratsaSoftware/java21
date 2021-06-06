package taxi;

import taxi.models.Driver;
import taxi.models.Passenger;
import taxi.models.Range;
import taxi.models.Trip;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.groupingBy;

public class TaxiPark {
    private List<Driver> allDrivers;
    private List<Passenger> allPassengers;
    private List<Trip> trips;

    public TaxiPark(List<Driver> allDrivers, List<Passenger> allPassengers, List<Trip> tripList) {
        this.allDrivers = allDrivers;
        this.allPassengers = allPassengers;
        this.trips = tripList;
    }

    /*
     * Task #1. Find all the drivers who performed no trips.
     */
    public List<Driver> findFakeDrivers() {
        List<Driver> allDriversThatHaveHadTrips = trips.stream()
                .map(Trip::getDriver)
                .distinct()
                .collect(Collectors.toList());

        return allDrivers
                .stream()
                .filter(driver ->
                        !allDriversThatHaveHadTrips.contains(driver)
                ).collect(Collectors.toList());
    }

    /*
     * Task #2. Find all the clients who completed at least the given number of trips.
     */
    public List<Passenger> findAllPassengersWhoCompletedGivenNumberOfTrips(int minTrips) {
        if (minTrips == 0) {
            return allPassengers;
        }

        Map<String, List<Passenger>> passengerMap =
                trips.stream()
                        .flatMap(trip -> trip.getPassengers().parallelStream())
                        .collect(groupingBy(Passenger::getName));

        return passengerMap.values().stream()
                .filter(passengers -> passengers.size() >= minTrips)
                .map(passengers -> passengers.get(0))
                .collect(Collectors.toList());
    }

    /*
     * Task #3. Find all the passengers, who were taken by a given driver more than once.
     */
    public List<Passenger> findFrequentPassengers(Driver driver) {
        Map<Driver, List<Passenger>> driverPassengerMap =
                trips.stream().collect(Collectors.toMap(Trip::getDriver, Trip::getPassengers,
                        (passenger1, passenger2) -> {
                            System.out.println("Duplicate driver found");
                            return Stream.concat(passenger1.stream(),
                                    passenger2.stream())
                                    .collect(Collectors.toList());
                        }));

        List<Passenger> passengers = driverPassengerMap.get(driver);

        Map<String, List<Passenger>> namePassengerMap = passengers.stream().collect(
                groupingBy(Passenger::getName));

        List<Passenger> faithfulPassengers = new ArrayList<>();

        for (Map.Entry<String, List<Passenger>> entry : namePassengerMap.entrySet()) {
            if (entry.getValue().size() > 1) {
                faithfulPassengers.add(entry.getValue().get(0));
            }
        }

        return faithfulPassengers;
    }


    /*
     * Task #4. Find the most frequent trip duration among minute periods 0..9, 10..19, 20..29, and so on.
     * Return any period if many are the most frequent, return null if there're no trips.
     */
    public Range findTheMostFrequentTripDurationPeriod() {
        Map<Range, List<Passenger>> rangePassengerMap =
                trips.stream().collect(Collectors.toMap(trip ->
                        getMinutesRange(trip.getDuration()), Trip::getPassengers,
                        (passenger1, passenger2) -> {
                            System.out.println("Duplicate driver found");
                            return Stream.concat(passenger1.stream(),
                                    passenger2.stream())
                                    .collect(Collectors.toList());
                        }));

        Range range = null;
        int maxNumberOfPassengers = 0;

        for (Map.Entry<Range, List<Passenger>> entry : rangePassengerMap.entrySet()) {
            if (entry.getValue().size() >= maxNumberOfPassengers) {
                maxNumberOfPassengers = entry.getValue().size();
                range = entry.getKey();
            }
        }

        return range;

    }

    private Range getMinutesRange(int duration) {
        int rangeLowerBorder = (duration / 10) * 10;
        return new Range(rangeLowerBorder, rangeLowerBorder + 9);
    }

}

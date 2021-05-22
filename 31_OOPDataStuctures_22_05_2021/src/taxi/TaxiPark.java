package taxi;

import taxi.models.Driver;
import taxi.models.Passenger;
import taxi.models.Trip;

import java.util.List;
import java.util.stream.Collectors;

public class TaxiPark {
    private List<Driver> allDrivers;
    private List<Passenger> allPassengers;
    private List<Trip> trips;

    public TaxiPark(List<Driver> allDrivers, List<Passenger> allPassengers, List<Trip> tripList) {
        this.allDrivers = allDrivers;
        this.allPassengers = allPassengers;
        this.trips = tripList;
    }

    public List<Driver> findFakeDrivers() {
        List<Driver> allDriversThatHaveHadTrips = trips.stream()
                .map(Trip::getDriver)
                .collect(Collectors.toList());

        return allDrivers
                .stream()
                .filter(driver ->
                        !allDriversThatHaveHadTrips.contains(driver)
                ).collect(Collectors.toList());
    }
}

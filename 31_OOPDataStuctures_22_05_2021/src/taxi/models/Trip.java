package taxi.models;

import java.util.List;

public class Trip {

    private Driver driver;
    private List<Passenger> passengers;
    // the trip duration in minutes
    private int duration;
    // the trip distance in km
    private double distance;

    public List<Passenger> getPassengers() {
        return passengers;
    }

    public Trip(Driver driver, List<Passenger> passengers, int duration, double distance) {
        this.driver = driver;
        this.passengers = passengers;
        this.duration = duration;
        this.distance = distance;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }


    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    @Override
    public String toString() {
        return "Trip{" +
                "driver=" + driver +
                ", passengers=" + passengers +
                ", duration=" + duration +
                ", distance=" + distance +
                '}';
    }
}

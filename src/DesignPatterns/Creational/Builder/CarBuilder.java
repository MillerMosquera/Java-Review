package DesignPatterns.Creational.Builder;

public class CarBuilder implements Builder {

    private Car car;

    public void reset() {
        this.car = new Car();
    }

    public void setSeats(int seats) {
        car.seats = seats;
    }

    public void setEngine(String engine) {
        car.engine = engine;
    }

    public void setTripComputer() {
        car.tripComputer = true;
    }

    public void setGPS() {
        car.gps = true;
    }

    //getResult:Car
    public Car getResult() {
        return this.car;
    }
}

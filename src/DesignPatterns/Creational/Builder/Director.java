package DesignPatterns.Creational.Builder;

public class Director {

    public void makeSUV(Builder builder) {
        builder.reset();
        builder.setSeats(2);
        builder.setEngine("V8");
        builder.setTripComputer();
        builder.setGPS();
    }

    public void makeSportCar(Builder builder) {
        builder.reset();
        builder.setSeats(4);
        builder.setEngine("V6");
        builder.setTripComputer();
        builder.setGPS();
    }
}

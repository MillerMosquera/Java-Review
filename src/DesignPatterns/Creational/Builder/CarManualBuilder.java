package DesignPatterns.Creational.Builder;

public class CarManualBuilder implements Builder {
    private Manual manual;

    public void reset() {
        this.manual = new Manual();
    }
    public void setSeats(int seats) {
        manual.seats = seats;
    }
    public void setEngine(String engine) {
        manual.engine = engine;
    }
    public void setTripComputer() {
        manual.tripComputer = true;
    }
    public void setGPS() {
        manual.gps = true;
    }
    public Manual getResult() {
        return this.manual;
    }
}

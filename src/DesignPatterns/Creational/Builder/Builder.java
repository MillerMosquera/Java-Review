package DesignPatterns.Creational.Builder;

public interface Builder {

    public void reset();
    public void setSeats(int seats);
    public void setEngine(String engine);
    public void setTripComputer();
    public void setGPS();

}

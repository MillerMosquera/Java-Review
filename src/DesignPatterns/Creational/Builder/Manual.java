package DesignPatterns.Creational.Builder;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Manual {
    public int seats;
    public String engine;
    public boolean tripComputer;
    public boolean gps;

    public Manual() {

    }
}

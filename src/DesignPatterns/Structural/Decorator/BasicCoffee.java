package DesignPatterns.Structural.Decorator;

public class BasicCoffee implements ICoffee{

    @Override
    public String GetDescription() {
        return "Basic Coffee";
    }

    @Override
    public double GetCost() {
        return 2;
    }
}

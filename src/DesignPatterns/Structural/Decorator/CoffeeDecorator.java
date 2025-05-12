package DesignPatterns.Structural.Decorator;

public class CoffeeDecorator implements ICoffee {

    private ICoffee coffee;

    public CoffeeDecorator(ICoffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String GetDescription() {
        return coffee.GetDescription();
    }

    @Override
    public double GetCost() {
        return coffee.GetCost();
    }
}

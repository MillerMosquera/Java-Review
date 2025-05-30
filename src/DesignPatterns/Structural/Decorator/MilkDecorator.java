package DesignPatterns.Structural.Decorator;

public class MilkDecorator extends CoffeeDecorator{

    public MilkDecorator(ICoffee coffee) {
        super(coffee);
    }
    @Override
    public String GetDescription() {
        return super.GetDescription() + " with milk";
    }
    @Override
    public double GetCost() {
        return super.GetCost() + 0.5;
    }
}

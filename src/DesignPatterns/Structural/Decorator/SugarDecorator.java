package DesignPatterns.Structural.Decorator;

public class SugarDecorator extends CoffeeDecorator{
    public SugarDecorator(ICoffee coffee) {
        super(coffee);
    }

    @Override
    public String GetDescription() {
        return super.GetDescription() + " with sugar";
    }
    @Override
    public double GetCost() {
        return super.GetCost() + 0.5;
    }
}

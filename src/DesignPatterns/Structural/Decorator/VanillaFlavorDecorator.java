package DesignPatterns.Structural.Decorator;

public class VanillaFlavorDecorator extends CoffeeDecorator{
    public VanillaFlavorDecorator(ICoffee coffee) {
        super(coffee);
    }

    @Override
    public String GetDescription() {
        return super.GetDescription() + " with vanilla flavor";
    }
    @Override
    public double GetCost() {
        return super.GetCost() + 0.5;
    }
}

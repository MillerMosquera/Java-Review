package DesignPatterns.Creational.FactoryMethod;

public class CircleFactory extends ShapeFactory {
    @Override
    Shape getShape(String shapeType) {
        return new Circle();
    }
}
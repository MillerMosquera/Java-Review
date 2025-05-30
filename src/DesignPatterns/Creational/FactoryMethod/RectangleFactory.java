package DesignPatterns.Creational.FactoryMethod;

public class RectangleFactory extends ShapeFactory {

    @Override
    Shape getShape(String shapeType) {
        return new Rectangle();
    }
}


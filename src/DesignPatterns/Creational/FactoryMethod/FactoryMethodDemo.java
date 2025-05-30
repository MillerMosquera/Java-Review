package DesignPatterns.Creational.FactoryMethod;

public class FactoryMethodDemo {
    public static void main(String[] args) {
        /* proporciona una interfaz para crear objetos en una superclase,
        mientras permite a las subclases alterar el tipo de objetos que se crearán.*/

        ShapeFactory shapeFactory = new CircleFactory(); // or RectangleFactory
        Shape shape = shapeFactory.getShape("circle"); // or rectangle
        shape.draw();
    }
}

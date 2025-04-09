package CreationalPatterns.Factory;

import CreationalPatterns.Factory.ConcreteFactory.ShapeFactory;
import CreationalPatterns.Factory.Product.Shape;

public class FactoryDemo {

    public static void main(String[] args) {

        ShapeFactory shapeFactory = new ShapeFactory();

        Shape shape = shapeFactory.getShape("Circle");
        shape.draw();

        shape = shapeFactory.getShape("Square");
        shape.draw();

        shape = shapeFactory.getShape("Rectangle");
        shape.draw();

    }
}

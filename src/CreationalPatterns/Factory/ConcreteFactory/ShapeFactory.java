package CreationalPatterns.Factory.ConcreteFactory;

import CreationalPatterns.Factory.ConcreteProduct.Circle;
import CreationalPatterns.Factory.ConcreteProduct.Rectangle;
import CreationalPatterns.Factory.ConcreteProduct.Square;
import CreationalPatterns.Factory.Factory.Factory;
import CreationalPatterns.Factory.Product.Shape;

public class ShapeFactory implements Factory {
    @Override
    public Shape getShape(String shape) {

        return switch (shape) {
            case "Circle" -> new Circle();
            case "Rectangle" -> new Rectangle();
            case "Square" -> new Square();
            default -> null;
        };
    }
}

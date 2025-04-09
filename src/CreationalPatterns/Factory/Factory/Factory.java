package CreationalPatterns.Factory.Factory;

import CreationalPatterns.Factory.Product.Shape;

public interface Factory {

    Shape getShape(String shape);
}

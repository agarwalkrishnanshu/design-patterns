package CreationalPatterns.Factory.ConcreteProduct;

import CreationalPatterns.Factory.Product.Shape;

public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Rectangle");
    }
}

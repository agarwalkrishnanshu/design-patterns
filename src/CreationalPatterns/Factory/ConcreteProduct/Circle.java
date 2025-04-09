package CreationalPatterns.Factory.ConcreteProduct;

import CreationalPatterns.Factory.Product.Shape;

public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Circle");
    }
}

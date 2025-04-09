package CreationalPatterns.Factory.ConcreteProduct;

import CreationalPatterns.Factory.Product.Shape;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Square");
    }
}

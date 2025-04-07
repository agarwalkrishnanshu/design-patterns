package StructuralPatterns.Decorator.PizzaBillingSystem.ConcreteComponent;

import StructuralPatterns.Decorator.PizzaBillingSystem.Component.BasePizza;

public class Margherita extends BasePizza {
    @Override
    public int cost() {
        return 100;
    }
}

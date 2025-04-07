package StructuralPatterns.Decorator.PizzaBillingSystem.ConcreteComponent;

import StructuralPatterns.Decorator.PizzaBillingSystem.Component.BasePizza;

public class FarmHouse extends BasePizza {
    @Override
    public int cost() {
        return 200;
    }
}

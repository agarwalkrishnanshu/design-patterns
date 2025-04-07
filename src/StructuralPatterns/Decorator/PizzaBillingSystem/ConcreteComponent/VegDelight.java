package StructuralPatterns.Decorator.PizzaBillingSystem.ConcreteComponent;

import StructuralPatterns.Decorator.PizzaBillingSystem.Component.BasePizza;

public class VegDelight extends BasePizza {
    @Override
    public int cost() {
        return 250;
    }
}

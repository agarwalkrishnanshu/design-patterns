package StructuralPatterns.Decorator.PizzaBillingSystem.ConcreteDecorator;

import StructuralPatterns.Decorator.PizzaBillingSystem.BaseDecorator.ToppingDecorator;
import StructuralPatterns.Decorator.PizzaBillingSystem.Component.BasePizza;

public class ExtraCheese extends ToppingDecorator {

    BasePizza basePizza;

    public ExtraCheese(BasePizza basePizza){
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return this.basePizza.cost() + 30;
    }
}

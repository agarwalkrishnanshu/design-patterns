package StructuralPatterns.Decorator.PizzaBillingSystem.ConcreteDecorator;

import StructuralPatterns.Decorator.PizzaBillingSystem.BaseDecorator.ToppingDecorator;
import StructuralPatterns.Decorator.PizzaBillingSystem.Component.BasePizza;

public class Mushroom extends ToppingDecorator {

    /*
    * One thing to notice here is this class Mushroom has both 'is-a' and 'has-a' relationship
    * with BasePizza
    *
    * Mushroom extends ToppingsDecorator which itself is a BasePizza so Mushroom is also a BasePizza
    * Due to this we have to implement the methods in the base pizza in this class as well
    *
    * Mushroom has a BasePizza member. So it has composition as well
    * We are getting BasePizza via Constructor injection here. So we can get any BasePizza
    * and we will be able to decorate its cost with the toppings cost
    *
    * */

    BasePizza basePizza;
    public Mushroom(BasePizza basePizza){
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return this.basePizza.cost() + 15;
    }
}

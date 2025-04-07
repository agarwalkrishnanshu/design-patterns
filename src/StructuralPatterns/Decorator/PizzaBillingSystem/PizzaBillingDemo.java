package StructuralPatterns.Decorator.PizzaBillingSystem;

import StructuralPatterns.Decorator.PizzaBillingSystem.Component.BasePizza;
import StructuralPatterns.Decorator.PizzaBillingSystem.ConcreteComponent.FarmHouse;
import StructuralPatterns.Decorator.PizzaBillingSystem.ConcreteComponent.Margherita;
import StructuralPatterns.Decorator.PizzaBillingSystem.ConcreteComponent.VegDelight;
import StructuralPatterns.Decorator.PizzaBillingSystem.ConcreteDecorator.ExtraCheese;
import StructuralPatterns.Decorator.PizzaBillingSystem.ConcreteDecorator.Mushroom;

public class PizzaBillingDemo {
    public static void main(String[] args) {
        BasePizza margheritaPizza = new Margherita();

        BasePizza margheritaExtraCheese = new ExtraCheese(margheritaPizza);
        System.out.println("Margherita Extra Cheese Pizza Final Cost:"+ margheritaExtraCheese.cost());

        BasePizza mushroomCheesePizza = new Mushroom(new ExtraCheese(new Margherita()));
        System.out.println("Mushroom Extra Cheese Margherita Pizza: "+ mushroomCheesePizza.cost());

        BasePizza vegDelight = new VegDelight();
        BasePizza vegDelightExtraCheese = new ExtraCheese(vegDelight);
        BasePizza mushroomVegDelightExtraCheese = new Mushroom(vegDelightExtraCheese);
        System.out.println("Mushroom Extra Cheese Veg Delight Pizza: "+ mushroomVegDelightExtraCheese.cost());

        BasePizza farmhouse = new FarmHouse();
        BasePizza farmhouseExtraCheese = new ExtraCheese(farmhouse);
        BasePizza mushroomFarmhouseExtraCheese = new Mushroom(farmhouseExtraCheese);
        System.out.println("Mushroom Extra Cheese Farmhouse Pizza: "+ mushroomFarmhouseExtraCheese.cost());
    }
}

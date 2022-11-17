package design_patterns.creational.factory_method;

import java.util.Locale;

public class PizzaFactory implements BasePizzaFactory{

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza;
        switch (type.toLowerCase()){
            case "cheese":
                pizza=new CheesePizza();
                break;
            case "pepperoni":
                pizza=new PepperoniPizza();
                break;
            case "veggie":
                pizza=new VeggiePizza();
                break;
            default: throw new IllegalArgumentException("No such Pizza");
        }
        pizza.addIngredients();
        pizza.bakePizza();
        return pizza;
    }
}

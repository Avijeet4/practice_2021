package design_patterns.creational.abstract_factory;

import design_patterns.creational.abstract_factory.product.CheesePizza;
import design_patterns.creational.abstract_factory.product.PepperoniPizza;
import design_patterns.creational.abstract_factory.product.Pizza;
import design_patterns.creational.abstract_factory.product.VeggiePizza;

public class SicilianPizzaFactory extends BasePizzaFactory {

//    public SicilianPizzaFactory(String type){
//        createPizza(type);
//    }

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza;
        BaseToppingFactory baseToppingFactory=new SicilianToppingFactory();

        switch (type.toLowerCase()){
            case "cheese":
                pizza=new CheesePizza(baseToppingFactory);
                break;
            case "pepperoni":
                pizza=new PepperoniPizza(baseToppingFactory);
                break;
            case "veggie":
                pizza=new VeggiePizza(baseToppingFactory);
                break;
            default: throw new IllegalArgumentException("no such Pizza.");
        }
        pizza.bakePizza();
        pizza.addIngredients();
        return pizza;
    }
}

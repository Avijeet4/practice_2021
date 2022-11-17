package design_patterns.creational.abstract_factory.product;

import design_patterns.creational.abstract_factory.BaseToppingFactory;
import design_patterns.creational.abstract_factory.product.Pizza;

public class PepperoniPizza extends Pizza {
    BaseToppingFactory baseToppingFactory;

    public PepperoniPizza(BaseToppingFactory baseToppingFactory){
        this.baseToppingFactory=baseToppingFactory;
    }
    @Override
    public void addIngredients() {
        System.out.println("Preparing Ingredients for Pepperoni Pizza");
        baseToppingFactory.createCheese();
        baseToppingFactory.createSauce();
    }
}

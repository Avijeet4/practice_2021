package design_patterns.creational.abstract_factory.product;

import design_patterns.creational.abstract_factory.BaseToppingFactory;
import design_patterns.creational.abstract_factory.product.Pizza;

public class VeggiePizza extends Pizza {
    BaseToppingFactory baseToppingFactory;

    public VeggiePizza(BaseToppingFactory baseToppingFactory){
        this.baseToppingFactory=baseToppingFactory;
    }
    @Override
    public void addIngredients() {
        System.out.println("Preparing Ingredients for Veggie Pizza");
        baseToppingFactory.createCheese();
        baseToppingFactory.createSauce();
    }
}

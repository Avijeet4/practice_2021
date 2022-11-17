package design_patterns.creational.abstract_factory.product;

import design_patterns.creational.abstract_factory.BaseToppingFactory;
import design_patterns.creational.abstract_factory.product.Pizza;

public class CheesePizza extends Pizza {
    BaseToppingFactory baseToppingFactory;

    public CheesePizza(BaseToppingFactory baseToppingFactory){
        this.baseToppingFactory=baseToppingFactory;
    }
    @Override
    public void addIngredients() {
        System.out.println("Preparing Ingredients for cheese Pizza");
        baseToppingFactory.createCheese();
        baseToppingFactory.createSauce();
    }
}

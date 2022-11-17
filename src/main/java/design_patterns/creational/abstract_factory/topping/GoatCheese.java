package design_patterns.creational.abstract_factory.topping;

import design_patterns.creational.abstract_factory.topping.Cheese;

public class GoatCheese extends Cheese {
    public GoatCheese(){
        prepareCheese();
    }
    @Override
    public void prepareCheese() {
        System.out.println("Preparing Goat Cheese");
    }
}

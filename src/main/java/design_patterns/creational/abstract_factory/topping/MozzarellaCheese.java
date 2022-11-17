package design_patterns.creational.abstract_factory.topping;

import design_patterns.creational.abstract_factory.topping.Cheese;

public class MozzarellaCheese extends Cheese {
    public MozzarellaCheese(){
        prepareCheese();
    }
    @Override
    public void prepareCheese() {
        System.out.println("Preparing Mozzarella Cheese");
    }
}

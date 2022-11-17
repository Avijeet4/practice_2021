package design_patterns.creational.abstract_factory;

import design_patterns.creational.abstract_factory.topping.Cheese;
import design_patterns.creational.abstract_factory.topping.MozzarellaCheese;
import design_patterns.creational.abstract_factory.topping.Sauce;
import design_patterns.creational.abstract_factory.topping.TomatoSauce;

public class SicilianToppingFactory extends BaseToppingFactory{

    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public Sauce createSauce() {
        return new TomatoSauce();
    }
}

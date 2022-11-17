package design_patterns.creational.abstract_factory;

import design_patterns.creational.abstract_factory.topping.CaliforniaSauce;
import design_patterns.creational.abstract_factory.topping.Cheese;
import design_patterns.creational.abstract_factory.topping.GoatCheese;
import design_patterns.creational.abstract_factory.topping.Sauce;

public class GourmetToppingFactory extends BaseToppingFactory{

    @Override
    public Cheese createCheese() {
        return new GoatCheese();
    }

    @Override
    public Sauce createSauce() {
        return new CaliforniaSauce();
    }
}

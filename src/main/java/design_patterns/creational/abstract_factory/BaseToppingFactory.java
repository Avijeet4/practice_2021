package design_patterns.creational.abstract_factory;

import design_patterns.creational.abstract_factory.topping.Cheese;
import design_patterns.creational.abstract_factory.topping.Sauce;

public abstract class BaseToppingFactory {
    public abstract Cheese createCheese();
    public abstract Sauce createSauce();
}

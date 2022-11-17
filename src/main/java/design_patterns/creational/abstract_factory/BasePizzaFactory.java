package design_patterns.creational.abstract_factory;

import design_patterns.creational.abstract_factory.product.Pizza;

public abstract class BasePizzaFactory {
    public abstract Pizza createPizza(String type);
}

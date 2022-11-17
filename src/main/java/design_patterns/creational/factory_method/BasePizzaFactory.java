package design_patterns.creational.factory_method;

public interface BasePizzaFactory {
    public abstract Pizza createPizza(String type);
}

package design_patterns.creational.factory_method;

public class PepperoniPizza extends Pizza{
    @Override
    public void addIngredients() {
        System.out.println("Preparing Ingredients for Pepperoni Pizza");
    }
}

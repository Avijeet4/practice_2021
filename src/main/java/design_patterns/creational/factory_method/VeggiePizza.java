package design_patterns.creational.factory_method;

public class VeggiePizza extends Pizza{
    @Override
    public void addIngredients() {
        System.out.println("Preparing Ingredients for veggie Pizza");
    }
}

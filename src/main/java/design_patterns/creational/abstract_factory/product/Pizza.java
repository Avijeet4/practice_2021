package design_patterns.creational.abstract_factory.product;

public abstract class Pizza {
    public abstract void addIngredients();
    public void bakePizza(){
        System.out.println("Pizza baked at 400 for 20 minutes");
    }
}

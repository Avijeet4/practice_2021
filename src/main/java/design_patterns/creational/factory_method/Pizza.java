package design_patterns.creational.factory_method;

public abstract class Pizza {
    public abstract void addIngredients();
    public void bakePizza(){
        System.out.println("Pizza baked at 400 for 20 minutes");
    }
}

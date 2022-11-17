package design_patterns.creational.abstract_factory.topping;

public class TomatoSauce extends Sauce{
    public TomatoSauce(){
        prepareSauce();
    }
    @Override
    void prepareSauce() {
        System.out.println("Preparing Tomato Sauce");
    }
}

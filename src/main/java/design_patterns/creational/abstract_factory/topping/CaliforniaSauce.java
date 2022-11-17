package design_patterns.creational.abstract_factory.topping;

public class CaliforniaSauce extends Sauce{
    public CaliforniaSauce(){
        prepareSauce();
    }
    @Override
    void prepareSauce() {
        System.out.println("Preparing California Sauce");
    }
}

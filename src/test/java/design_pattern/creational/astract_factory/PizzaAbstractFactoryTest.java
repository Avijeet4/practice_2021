package design_pattern.creational.astract_factory;

import design_patterns.creational.abstract_factory.BasePizzaFactory;
import design_patterns.creational.abstract_factory.GourmetPizzaFactory;
import design_patterns.creational.abstract_factory.SicilianPizzaFactory;
import org.junit.jupiter.api.Test;

public class PizzaAbstractFactoryTest {
    @Test
    public void sicilianPizzaFactoryTest(){
        BasePizzaFactory basePizzaFactory=new SicilianPizzaFactory();
        basePizzaFactory.createPizza("cheese");
        basePizzaFactory.createPizza("veggie");
        basePizzaFactory.createPizza("pepperoni");
    }

    @Test
    public void gourmetPizzaFactoryTest(){
        BasePizzaFactory basePizzaFactory=new GourmetPizzaFactory();
        basePizzaFactory.createPizza("cheese");
        basePizzaFactory.createPizza("veggie");
        basePizzaFactory.createPizza("pepperoni");
    }
}

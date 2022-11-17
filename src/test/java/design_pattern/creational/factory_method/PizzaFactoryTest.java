package design_pattern.creational.factory_method;

import design_patterns.creational.factory_method.BasePizzaFactory;
import design_patterns.creational.factory_method.Pizza;
import design_patterns.creational.factory_method.PizzaFactory;
import org.junit.jupiter.api.Test;

public class PizzaFactoryTest {
    @Test
    public void createPizzaTest(){
        BasePizzaFactory basePizzaFactory=new PizzaFactory();
        Pizza cheesePizza=basePizzaFactory.createPizza("cheese");
        Pizza pepperoniPizza=basePizzaFactory.createPizza("pepperoni");
    }
}

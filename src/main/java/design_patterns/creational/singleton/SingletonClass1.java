package design_patterns.creational.singleton;

public class SingletonClass1 {
    private static SingletonClass1 singletonClass1;
    private SingletonClass1(){}
    public SingletonClass1 getSingletonClass1Instance(){
        if(singletonClass1==null)
            singletonClass1=new SingletonClass1();
        return singletonClass1;
    }
}

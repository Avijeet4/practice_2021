package design_patterns.creational.singleton;

public class ThreadSafeSingleton {
    private static ThreadSafeSingleton threadSafeSingleton;
    private ThreadSafeSingleton(){

    }
    public synchronized ThreadSafeSingleton getInstance(){
        if(threadSafeSingleton==null)
            threadSafeSingleton=new ThreadSafeSingleton();
        return threadSafeSingleton;
    }
}

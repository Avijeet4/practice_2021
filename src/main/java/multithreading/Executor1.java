package multithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Executor1 {
    private static ExecutorService executor1 = Executors.newFixedThreadPool(10);
    private static ExecutorService executor2 = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<Runnable>());



    public static void main(String[] args) {
        //tasks

        Runnable runnableTask=()->{
            try {
                System.out.println("Runnable Task");
                TimeUnit.MILLISECONDS.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        Callable callableTask=()->{
            System.out.println("Callable Task");
            TimeUnit.MILLISECONDS.sleep(3);
            return "Callable Task";
        };

        List<Callable<String>> callableTasks=new ArrayList<>();
        callableTasks.add(callableTask);
        callableTasks.add(callableTask);
        callableTasks.add(callableTask);

//        executor1.execute(runnableTask);
        Future<String> future=executor1.submit(callableTask);
//        System.out.println(future.get());

        executor1.shutdownNow();
//        executor2.shutdownNow();
    }

}

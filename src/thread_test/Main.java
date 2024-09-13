package thread_test;

import thread_test.model.MyCallable3;
import thread_test.model.MyThread1;
import thread_test.model.MyRunnable2;

import java.util.concurrent.*;

import static java.lang.Thread.sleep;

public class Main {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        System.out.println("Salam");


        MyThread1 t1 = new MyThread1();
        t1.start();
//        sleep(100);

        // Creating a new object of the JavaRallable class
        Thread t2 = new Thread(new MyRunnable2());
        t2.start();
        sleep(100);


        // Creating a new object of the JavaCallable class
        FutureTask futureTask = new FutureTask(new MyCallable3());
        Thread t3 = new Thread(futureTask);
        t3.start();
        sleep(100);


        ExecutorService pool = Executors.newCachedThreadPool();
        Callable callable1 = new MyCallable3();
        Callable callable2 = new MyCallable3();
        Future future = pool.submit(callable1);
        Future future1 = pool.submit(callable2);
        System.out.println(future.get());
        System.out.println(future1.get());


        System.out.println("Khodahafez");
    }
}
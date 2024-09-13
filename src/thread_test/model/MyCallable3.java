package thread_test.model;

import java.util.concurrent.Callable;

public class MyCallable3 implements Callable {

    @Override
    public Object call() throws Exception {
        System.out.println("Hello3");
        System.out.println("Bye3");
        return null;
    }
}

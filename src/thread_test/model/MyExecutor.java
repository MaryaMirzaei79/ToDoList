package thread_test.model;

import java.util.concurrent.Executor;

public interface MyExecutor extends Executor{
    void execute(Runnable command);

    MyExecutor executor = new MyExecutor() {
        @Override
        public void execute(Runnable command) {
            new Thread(command).start();
        }
    };


}

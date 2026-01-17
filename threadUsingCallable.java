package BasicJava;
//Callable is an interface used to create threads that can return a result and throw exceptions
import java.util.concurrent.*;
//thread usability is here which was not available in other methods.
//Instead of creating threads manually, we submit tasks, and the executor handles thread creation, scheduling, and execution.
//Method	Purpose
//submit()	Submit task
//execute()	Run task
//shutdown()	Graceful shutdown
//shutdownNow()	Force shutdown
//isShutdown()	Check status
//awaitTermination()	Wait for completion
public class threadUsingCallable {
    static class myThread3 implements Callable {
        @Override
        public Object call() throws Exception {
            System.out.println("call method executed..");
            return "hi";
        }
    }
    public static void main(String[] args) throws Exception {
        myThread3 m3=new myThread3();
        //executor service will be used to create thread and to reuse thread.
        //using executor we can submit tasks to pool of thread.
        //it will re-use threads available in pool to complete all tasks/
        ExecutorService executorService = Executors.newFixedThreadPool(10);//collection of pools and fixed no of thread.
        //no of task
        for(int i=1;i<15;i++){
            Future submit = executorService.submit(m3);
            System.out.println(submit.get().toString());
        }
        executorService.shutdown();

    }
}

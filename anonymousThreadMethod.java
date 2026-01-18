package BasicJava;

import org.w3c.dom.ls.LSOutput;

import java.util.concurrent.*;

//without extending thread class,implementing runnable or callable .
// we will directly implement in main method.
public class anonymousThreadMethod extends Thread {
    public static void main(String[] args) throws Exception {
        Thread t=new Thread(){
            @Override
            public void run(){
                System.out.println("this is run method from thread class");
            }
        };
        t.start();
        Runnable r=new Runnable() {
            @Override
            public void run() {
                System.out.println("this is thread method from runnable interface");
            }
        };
        Thread t1=new Thread(r);
        t1.start();
        Callable c=new Callable() {
            @Override
            public Object call() throws Exception {
                System.out.println("This is run method from callable interface");
                return "hi";
            }
        };
        ExecutorService executorService = Executors.newFixedThreadPool(1);
         executorService.submit(c);
         //using lambda expression
        Callable c2= () -> {
            System.out.println("Hello");
            return "Hello";
        };
        c2.call();



    }
}

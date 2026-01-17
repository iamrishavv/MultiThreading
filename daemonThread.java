package BasicJava;
//A Daemon Thread is a background thread that runs in support of user threads.
//JVM automatically stops daemon threads when all user (non-daemon) threads finish.
//Ex:Garbage Collector (GC),Finalizer thread,Background monitoring threads
//there are 3 types of thread
//default(by jvm),user defined(using class ,runnable and callable interface) and daemon thread
// when  jvm reaches end of main method it will shut down the program .if it found demon thread running  it will terminate it and shut down the program.
public class daemonThread {
     static class myThread4 implements Runnable {
       public void run(){
          // Thread currentThread =Thread.currentThread();
           if(Thread.currentThread().isDaemon()) {
               System.out.println("I am daemon method");
           }else{
               System.out.println("normal thread executed");
           }
        }
    }
    public static void main(String[] args) {
        myThread4 mt=new myThread4();
        Thread th=new Thread(mt);
        th.setDaemon(true);////use setDemon method to start demon thread
        th.start();
    }
}

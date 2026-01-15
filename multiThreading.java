package BasicJava;
//Multithreading is the ability of a program to execute multiple threads simultaneously within a single process.
//👉 Each thread represents an independent path of execution.
//Why Multithreading is Needed?
//Better CPU utilization
//Faster execution
//Responsive applications
//Perform background tasks
public class multiThreading {

    public static void main(String[] args) {
        //Pre-defined thread by jvm
        Thread thread = Thread.currentThread();
//        System.out.println(thread);
//        System.out.println(thread.getState());
//        System.out.println(thread.getName());
        String name = thread.getName();
        ThreadGroup threadGroup = thread.getThreadGroup();
        System.out.println(name +"_Thread started");
        System.out.println(name+"_Thread Ended");
        System.out.println(threadGroup);
        System.out.println(thread.getPriority());


    }
}

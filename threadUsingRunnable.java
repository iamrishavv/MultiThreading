package BasicJava;
//Thread using implementing runnable interface.
public class threadUsingRunnable {
    static class myThread2 implements Runnable{

        @Override
        public void run() {
            System.out.println("MyThread started");
            m1();
            System.out.println("MyThread Ended");
        }
        void m1(){
            System.out.println("M1 method called");
        }
    }
    public static void main(String[] args) {
        System.out.println("Main Thread started");
        myThread2 mt=new myThread2();
        // mt.m1();
        Thread t=new Thread(mt) ;
        t.start();
        System.out.println("Main Thread Ended");
    }
}

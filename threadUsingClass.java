package BasicJava;
//Thread using extending thread class.
public class threadUsingClass {
    static class myThread extends Thread{
        public void run(){
            System.out.println("MyThread started");
            m1();
            System.out.println("MyThread Ended");
        }
        void m1(){
            System.out.println("I am from m1() method.");
        }
    }
    public static void main(String[] args) {
        System.out.println("Main Thread started");
        myThread mt=new myThread();
       // mt.m1();
        Thread t=new Thread(mt) ;
        t.start();
        System.out.println("Main Thread Ended");
    }
}

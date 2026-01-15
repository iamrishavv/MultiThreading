package BasicJava;

public class threadMethod {
    static class myThread3 implements Runnable {
        @Override
        public void run() {
            System.out.println("MyThread started" +Thread.currentThread().getName());
            try {
                Thread.sleep(5000);//sleep for 5 sec
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("MyThread Ended" +Thread.currentThread().getName());
        }

    }
    public static void main(String[] args) {
        myThread3 mt = new myThread3();
        Thread t1 = new Thread(mt);
        t1.setName("Thread 1");
        t1.setPriority(Thread.NORM_PRIORITY);
        Thread t2 = new Thread(mt);
        t2.setName("Thread 2");
        t2.setPriority(Thread.MIN_PRIORITY);
        Thread t3 = new Thread(mt);
        t3.setName("Thread 3");
        t3.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
    }
}
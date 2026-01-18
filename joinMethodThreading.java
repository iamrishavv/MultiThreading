package BasicJava;
//join() is a thread method used to make one thread wait for another thread to finish execution.
//👉 The calling thread will pause until the target thread completes.
public class joinMethodThreading {
    public static void main(String[] args) throws Exception {
        Thread t1=new Thread(){
            @Override
            public void run(){
                for(int i=1;i<5;i++) {
                    System.out.println(Thread.currentThread().getName() + " " + i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        };
        t1.setName("Thread 1");
        Thread t2=new Thread(){
            @Override
           public void run(){
                for(int i=1;i<5;i++){
                    System.out.println(Thread.currentThread().getName() + " " +i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        };
        t2.setName("Thread 2");
        t1.start();
        t1.join();//it stops 2nd method until 1st does not finished.
        t2.start();
    }
}

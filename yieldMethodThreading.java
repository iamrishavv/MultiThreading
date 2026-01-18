package BasicJava;
//yield() is a static method of Thread class that makes the currently running thread pause temporarily and give chance
// to other threads of same priority to execute.
//with yield method --Slightly higher chance of switching
//But still not guaranteed
public class yieldMethodThreading {
    public static void main(String[] args) throws InterruptedException {
        Thread t1=new Thread(){
            @Override
            public void run() {
                for (int j = 1; j <= 5; j++) {
                    System.out.println(Thread.currentThread().getName() + "" + j);
                    Thread.yield();
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        };
        Thread t2=new Thread(){
            @Override
            public void run(){
                for(int i=1;i<=5;i++){
                    System.out.println(Thread.currentThread().getName()+""+ i);
                    Thread.yield();
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        };
        t1.start();
        t1.join();
        t2.start();
    }
}

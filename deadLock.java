package BasicJava;
//Deadlock is a situation where two or more threads wait forever for each other’s resources, so no thread can proceed.
//Two thread:
//thread A holds Key 1 and waits for Key 2
//thread B holds Key 2 and waits for Key 1
//👉 Both waiting → Deadlock
public class deadLock {

    public static void main(String[] args) {
        String s1="rishav";
        String s2="rishu";
        Thread t1=new Thread(){
            @Override
            public void run(){
                synchronized (s1){
                    System.out.println("Thread 1 locked resource 1");
                    //if we do not keep sleep method then one method will hold both resource
                    try {
                        Thread.sleep(1000);
                    }catch (Exception e){
                        e.printStackTrace();
                    }

                    synchronized (s2){
                        System.out.println("Thread 1 waiting for resource 2 ");
                    }
                }
            }
        };
        Thread t2=new Thread(){
            @Override
            public void run(){
                synchronized (s2){
                    System.out.println("Thread 2 locked resource 2");
                    try {
                        Thread.sleep(1000);
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                    synchronized (s1){
                        System.out.println("Thread 2 waiting for resource 1");
                    }
                }

            }
        };
        t1.start();
        t2.start();
    }
}

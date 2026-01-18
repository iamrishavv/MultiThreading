package BasicJava;
//go for synchronized method if whole logic is important if not go for block
//method
public class synchronizedMethodAndBlock implements Runnable {
    public synchronized void printNumbers(){//with-out synchronized keyword both thread can access the method simultaneously
        for(int i=1;i<=10;i++){
            System.out.println(Thread.currentThread().getName() + " " + i);
            try{
                Thread.sleep(1000);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
    //block
    public void printNumbers2(){
        synchronized (this){
            for(int i=1;i<=9;i++){
                System.out.println(Thread.currentThread().getName() + " " + i);
                try{
                    Thread.sleep(1000);
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }
    }
    public void run(){
        printNumbers();
        printNumbers2();
    }
    public static void main(String[] args) {
        synchronizedMethodAndBlock s=new synchronizedMethodAndBlock();
        Thread a=new Thread(s);
        a.start();
        Thread b=new Thread(s);
        b.start();
    }
}

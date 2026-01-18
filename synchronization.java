package BasicJava;
//Synchronization is a mechanism used to control access of multiple threads to shared resources to avoid data inconsistency.
//👉 It ensures that only one thread executes critical section at a time
//Why Synchronization is Needed?
//a)Prevent race condition
//b)Avoid data corruption
//c)Maintain consistency-->when multiple thread try to access the resource one resource ata same time then it will lead to data inconsistency
//d)Thread safety
//Disadvantages
//a)Slower performance
//b)Thread blocking
//c)Deadlock possibility
//To avoid data inconsistency problem synchronization is used so that only one thread can access one resource at a time.
public class synchronization implements Runnable {
//    int availableTicket=100;
//    public void run(){
//        if(availableTicket>0){
//            //logic to book ticket
//            availableTicket--;
//        }
//    }
    public void printNumbers(){
        for(int i=1;i<=10;i++){
            System.out.println(Thread.currentThread().getName()+" "+ i);
            try{
                Thread.sleep(1000);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
    public void run(){
        printNumbers();
    }

    public static void main(String[] args) {
//        synchronization s=new synchronization();
//        Thread t1=new Thread(s);
//        Thread t2=new Thread(s);
//        Thread t3=new Thread(s);
//        t1.start();
//        t2.start();
//        t3.start();
        //using synchronized method or block we can achieve thread safety
        synchronization s1=new synchronization();
        Thread t4=new Thread(s1);
        t4.start();
        Thread t5=new Thread(s1);
        t5.start();
    }
}

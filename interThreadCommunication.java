package BasicJava;
//Inter-thread communication is a mechanism where threads communicate with each other to coordinate their execution and share data safely.
//👉 It helps threads wait, notify, and resume execution without busy waiting.
//Think of two threads:
//One thread produces data
//Another thread consumes data
//They must signal each other when to work
public class interThreadCommunication {
    static  class customer{
        int amount=10000;
        synchronized void withdraw(int amount){
            System.out.println("Going to withdraw...");
            if(this.amount<amount){
                System.out.println("Less amount Waiting for deposit");
                try {
                    wait();
                }catch (Exception e){
                }
            }
            this.amount-=amount;
            System.out.println("Withdraw completed");
        }
        synchronized void deposit(int amount){
            System.out.println("Going to deposit");
            this.amount+=amount;
            System.out.println("Amount deposited");
            notify();
        }
    }

    public static void main(String[] args) {
        final customer c=new customer();
        new Thread(){
            public void run(){
                c.withdraw(15000);
            }
        }.start();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        new Thread(){
            public void run(){
                c.deposit(20000);
            }
        }.start();
    }
}

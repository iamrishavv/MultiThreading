package BasicJava;

public class innerClasses {
    static class run{
        void run(){
            System.out.println("running");
        }
    }
    public static void main(String[] args) {
        run r=new run();
        r.run();
    }
}

package BasicJava;

public class generics1 <T>{
    T obj;
    void add(T obj){
        this.obj=obj;
    }
    T get(){
        return obj;
    }
    public static void main(String[] args) {
        generics1 <Integer> g=new generics1<>();
        g.add(10);
        System.out.println(g.get());
        generics1<String> g1=new generics1<>();
        g1.add("rishav");
        System.out.println(g1.get());
    }
}

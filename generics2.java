package BasicJava;

public class generics2<T1,T2 > {
    T1 obj1;
    T2 obj2;
    generics2(T1 obj1,T2 obj2){
        this.obj1=obj1;
        this.obj2=obj2;
    }
    void print(){
        System.out.println(obj1 +" _ " +obj2);
    }

    public static void main(String[] args) {
        generics2<Integer,String > g=new generics2<>(10,"rishav");
        g.print();
        generics2<String , Double> g1=new generics2<>("sonu",12.3);
        g1.print();


    }
}

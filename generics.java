package BasicJava;
//Generics allow you to write type-safe and reusable code by specifying the type at compile time.
//using diamond braces we can pass the T type and it becomes independent of data type.
//Generics class :we have to specify the safety type in class itself.
public class generics<T> {
   // T obj;
    public void m1(T obj){
        System.out.println("This is:" +obj);
    }
    public static void main(String[] args) {
        generics g=new generics();
        g.m1(10);//integer
        g.m1("hi");//string
        g.m1(23.4);//float
        g.m1(true);//boolean
    }
}

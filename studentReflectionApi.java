package BasicJava;

import org.w3c.dom.ls.LSOutput;

public class studentReflectionApi {
    private int id;
    private String name;
    private int age;
    studentReflectionApi(){
       // System.out.println("Hello");
    }
    studentReflectionApi(int i){
        System.out.println("Hello2");
    }
    public void display(){
        System.out.println("hi");
    }
    public void m1(){
        System.out.println("I ama from m1 method");
    }
    public void m2(){
        System.out.println("I ama from method m2");
    }

    public void  getAge() {
        System.out.println("Age: " +age);
    }

    public static void main(String[] args) {

    }
}


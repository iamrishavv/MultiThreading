package BasicJava;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

//using reflection api we can analyze our class.
//what variable available,method available,constructor available.
public class reflectionApi {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        //load the class in jvm(classname +package name).
        Class clz = Class.forName("BasicJava.studentReflectionApi");
        Field[] declaredFields = clz.getDeclaredFields();
        //get all field in class
        for(Field f:declaredFields){
            System.out.println("Variables are: "+ f.getName());
        }
        //get all methods
        Method[] declaredMethod = clz.getDeclaredMethods();
        for(Method m:declaredMethod){
            System.out.println("Methods are:"+ m.getName());
        }
        //get all constructors
        Constructor[] constructor = clz.getDeclaredConstructors();
        for(Constructor c:constructor){
            System.out.println("Constructors are: " +c.getName());
        }
        studentReflectionApi s=new studentReflectionApi();
       // s.age=30;
        s.getAge();
        //make field accessible outside the class
      //  Object obj = clz.newInstance();--deprecated
        Object obj = clz.getDeclaredConstructor().newInstance();

        Field f = clz.getDeclaredField("age");

        f.setAccessible(true);
        f.set(obj,30);
        studentReflectionApi s1=(studentReflectionApi) obj;
        s1.getAge();


    }
}

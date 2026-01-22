package BasicJava;
//enum (enumeration) is a special data type used to define a fixed set of constants.
//to declare constant using enum we use enum keyword
//when we want to define predefine constants then we will use enum
//we cant override enum constant and cant create object also ,cannot extends class but can implements interface.
public class enumUaration {
    enum WEEKDAY{
        MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY
    }
    enum WEEKENDS{
        SATURDAY,SUNDAY
    }
    public static void main(String[] args){
       //to print the values of the data inside the enum.
        WEEKDAY[] values = WEEKDAY.values();
        for(WEEKDAY w:values){
            System.out.println(w);
        }
        WEEKENDS[] values1 = WEEKENDS.values();
        for(WEEKENDS w1:values1){
            System.out.println(w1);
        }
    }
}

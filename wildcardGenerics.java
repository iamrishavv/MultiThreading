package BasicJava;
//A Wildcard (?) represents an unknown type in generics
//three types -unbound ,upperbound,
import java.util.ArrayList;
import java.util.List;

public class wildcardGenerics {
    public static void main(String[] args) {
        ArrayList<Integer> l=new ArrayList<>();
        ArrayList<? extends Number> l1=new ArrayList<>();


    }
}

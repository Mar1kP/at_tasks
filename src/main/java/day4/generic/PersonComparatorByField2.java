package day4.generic;
import java.util.Comparator;
import day4.reflection.MyCustomClass;

public class PersonComparatorByField2 implements Comparator<MyCustomClass> {
    public int compare(MyCustomClass o1, MyCustomClass o2) {
        return o1.getField2().compareTo(o2.getField2());
    }
}

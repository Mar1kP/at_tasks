package day4.generic;

import day4.reflection.MyCustomClass;

import java.util.Comparator;

public class PersonComparatorByField3 implements Comparator<MyCustomClass> {
    public int compare(MyCustomClass o1, MyCustomClass o2) {
        return o1.getField3().compareTo(o2.getField3());
    }
}

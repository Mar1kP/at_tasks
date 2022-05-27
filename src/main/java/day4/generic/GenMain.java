package day4.generic;

import day4.reflection.MyCustomClass;
import java.util.*;

public class GenMain {
    public static void main(String[] args) {
        //Make two different comparators for your Custom class
        // (simple java class with few fields).
        // End users should be able to use ‘min’, ‘max’, ‘sotr’ methods
        // with that comparators.

        List<MyCustomClass> list = new ArrayList<>(Arrays.asList(

                new MyCustomClass("one1", 123),
                new MyCustomClass("two2", 321),
                new MyCustomClass("three3", 333),
                new MyCustomClass("four4", 111)

        ));

        System.out.println(list);

        System.out.println(max(list, new PersonComparatorByField2()));
        System.out.println(min(list, new PersonComparatorByField2()));

        sort(list, new PersonComparatorByField2());

        System.out.println(list);
    }

    private static void sort(List<MyCustomClass> list, PersonComparatorByField2 personComparatorByField2) {
        Collections.sort(list, personComparatorByField2);
    }

    private static MyCustomClass min(List<MyCustomClass> list, PersonComparatorByField2 personComparatorByField2) {
        return Collections.min(list, personComparatorByField2);
    }

    private static MyCustomClass max(List<MyCustomClass> list, Comparator personComparatorByField2) {
        return Collections.max(list, personComparatorByField2);
    }

}

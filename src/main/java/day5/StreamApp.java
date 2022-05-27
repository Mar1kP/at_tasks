package day5;

import day4.generic.PersonComparatorByField2;
import day4.reflection.MyCustomClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApp {
    public static void main(String[] args) {
        System.out.println(Arrays.asList(args));
        List<MyCustomClass> list = new ArrayList<>(Arrays.asList(

                new MyCustomClass("one1", 123),
                new MyCustomClass("two2", 321),
                new MyCustomClass("three3", 333),
                new MyCustomClass("four4", 111)

        ));


        System.out.println(list);
        List<String> sortedList = list.stream().sorted(new PersonComparatorByField2())
                .map(MyCustomClass::getField1).collect(Collectors.toList());
        System.out.println(sortedList);

        List<String> list1 = list.stream().sorted(Comparator.comparing(MyCustomClass::getField1))
                .map(MyCustomClass::getField1).collect(Collectors.toList());
        System.out.println(list1);


    }
}

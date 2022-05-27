package day4.reflection;

import java.lang.reflect.Field;

public class RefMain {
    public static void main(String[] args) {

        MyCustomClass myCustomClass = new MyCustomClass("new1", 1111);

        System.out.println(get(myCustomClass, "field1"));
        System.out.println(set(myCustomClass, "field1", "another one"));
        System.out.println(clear(myCustomClass, "field1"));

    }

    private static Object clear(Object object, String fieldName) {
        Class thisClass = object.getClass();
        try {
            Field f = thisClass.getDeclaredField(fieldName);
            f.setAccessible(true);
            f.set(object, "");
            return f.get(object);
        }
        catch (IllegalAccessException | NoSuchFieldException e) {
            e.printStackTrace();
        }

        return null;

    }

    private static Object set(Object object, String fieldName, String text) {

        Class thisClass = object.getClass();

        try {
            Field f = thisClass.getDeclaredField(fieldName);
            f.setAccessible(true);
            f.set(object, text);
            return f.get(object);
        }
        catch (IllegalAccessException | NoSuchFieldException e) {
            e.printStackTrace();
        }
        return null;
    }

    private static Object get(Object object, String fieldName) {

        Class thisClass = object.getClass();

        try {
            Field f = thisClass.getDeclaredField(fieldName);
            f.setAccessible(true);
            return f.get(object);
        }
        catch (IllegalAccessException | NoSuchFieldException e) {
            e.printStackTrace();
        }
        return null;
    }




}

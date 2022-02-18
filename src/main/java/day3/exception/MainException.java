package day3.exception;

import day_2.Calculator;

public class MainException {
    //1) Make your own Exception implementation. Use it in your CalcApp
    public static void main(String[] args) {
        System.out.println(Calculator.divide(5, 0));
    }
}
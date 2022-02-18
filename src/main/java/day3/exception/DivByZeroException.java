package day3.exception;

public class DivByZeroException extends Throwable {
    public DivByZeroException(String message){
        super(message);
        System.out.println("DivByZeroException created");

    }

}

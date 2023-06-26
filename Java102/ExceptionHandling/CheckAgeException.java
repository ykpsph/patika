package Java102.ExceptionHandling;

public class CheckAgeException extends Exception{
    public CheckAgeException(String message) {
        super(message);
        System.out.println("Yas hatasi alindi");
    }
}

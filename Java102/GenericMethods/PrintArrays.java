package Java102.GenericMethods;

public class PrintArrays {
    public static <T> void printArray(T[] arr) {
        for(T t : arr){
            System.out.println(t);
        }
    }
}

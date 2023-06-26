package Java102.ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("program basladi");
        Scanner scan = new Scanner(System.in);

        int a = 0;
        int b = 2;
        int c;
        int[] arr = new int[5];
        try {
            System.out.println("bolme islemi");
            System.out.println(b/a);
            System.out.println("bolme islemi bitti");
            c = scan.nextInt();
            arr[10] = 11;
        } catch (Exception e){
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Bu kisim kesinlikle calisacak");
        }
        System.out.println("program bitti");
    }
}

package Java102.ExceptionHandling;

import java.util.Scanner;

public class Throw {
    public static void checkAge(int age) throws Exception {
        if(age < 18){
            throw new CheckAgeException("Hata yakalandi");
        } else {
            System.out.println("Yasiniz uygundur.");
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.print("Yasinizi giriniz: ");
        int age = input.nextInt();

        checkAge(age);

        System.out.println("Program bitti.");
    }
}

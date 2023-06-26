package Java101;

import java.util.Scanner;

public class UsluSayi {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int base;
        int us;
        System.out.println("base: ");
        base = input.nextInt();
        System.out.println("us: ");
        us = input.nextInt();

        int result = 1;
        for(int i = 1; i <= us; i++){
            result *= base;
        }
        System.out.println(base + " ^^ "+us + " = " +result);
    }
}

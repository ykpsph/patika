package Java101;

import java.util.Scanner;

public class Faktoriyel {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        int result = 1;
        for(int i = 1; i <= num; i++){
            result *= i;
        }
        System.out.println(num + "! is equal to: "+result);
    }
}

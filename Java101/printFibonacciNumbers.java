package Java101;

import java.util.Scanner;

public class printFibonacciNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int num1 = 0;
        int num2 = 1;
        int num3;
        int i;


        //System.out.print(num1 + " "+num2);

        for(i = 0; i < n; i++){
            num3 = num1 + num2;
            System.out.println(num1 + " + " + num2 + " = " + num3);

            num1 = num2;
            num2 = num3;
        }
    }
}

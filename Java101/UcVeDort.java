package Java101;

import java.util.Scanner;

public class UcVeDort {
    public static void main(String[] args){
        int count = 0;
        int sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Nereye kadar?");
        int num = input.nextInt();

        for(int i = 1; i < num; i++){
            if(i % 3 == 0 && i % 4 == 0) {
                System.out.println("i: "+i);
                sum += i;
                System.out.println("sum: "+sum);
                count++;
            }
        }
        System.out.println("sum: "+sum + " count: "+ count);
        System.out.println(sum/count);
    }
}
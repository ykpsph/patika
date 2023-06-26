package Java101;

import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
//        int num1 = input.nextInt();
//        int num2 = input.nextInt();
        int num1 = 18;
        int num2 = 24;




//        for(int i = (num1 < num2 ? num2 : num1); i >= 1; i--){
//            if(num1 % i == 0 && num2 % i == 0){
//                System.out.println("Ebob: " + i);
//                int ebob = i;
//                int ekok = (num1*num2)/ebob;
//                System.out.println("Ekok: "+ekok);
//                break;
//            }
//        }
        for(int i = 1; i <= num1+num2; i++){
            if(num1 % i == 0 && num2 % i == 0){
                System.out.println("Ebob: "+i);
//                int ekok = (num1*num2)/i;
//                System.out.println("Ekok: "+ekok);
                break;
            }
        }
    }
}

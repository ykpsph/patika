package Java101;

import java.util.Scanner;

public class RecursiveAsalSayi {
//    static boolean isAsal(int num){
//        if(num == 1 || num == 2 || num == 3 || num == 5 || num == 7){
//            return true;
//        }
//
//        int
//    }
//
//    public static void main(String[] args){
//        Scanner input = new Scanner(System.in);
//        int num = input.nextInt();
//        boolean result = isAsal(num);
//
//
//        if(result){
//            System.out.print(num + " bir asal sayidir.");
//        } else
//            System.out.print(num + " bir asal sayi degildir.");
//
//    }

    static boolean asal(int num, int i){
        if(num <= 2){
            return num == 2 ? true : false;
        }
        if(num % i == 0){
            return false;
        }
        if(i * i > num){
            return true;
        }

        return asal(num, i+1);
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayi giriniz: ");
        int num = input.nextInt();

        if(asal(num, 2)){
            System.out.println(num + " bir asal sayidir");
        } else {
            System.out.println(num+" bir asal sayi degildir.");
        }
    }
}

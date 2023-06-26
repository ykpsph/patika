package Java101;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class RecursiveEkleCikar {

//    static int ekleCikar(int num){
//        System.out.print(num + " ");
//        int temp = num;
//        while(num > 0){
//            num -= 5;
//            System.out.print(num + " ");
//        }
//        while(temp > num){
//            num += 5;
//            System.out.print(num+" ");
//        }
//        System.out.println("\n---------------------");


//        return 0;
//    }

//    static void ekleCikar(int num) {
//        int temp;
//        temp = num;
//        while(num >= 0){
//            System.out.print(num+" ");
//            num-=5;
//        }
//        while(temp >= num){
//            System.out.print(num+" ");
//            num+=5;
//        }
//    }

    static int ekleCikar(int num, int end){
        System.out.print(num+" ");
        while(num > 0){
            num -= 5;
            System.out.print(num+" ");
        }
        while(num < end){
            num += 5;
            System.out.print(num+" ");
        }
        if(num == end){
            return 1;
        }

        return ekleCikar(num, end);
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayi giriniz: ");
        int num = input.nextInt();

        System.out.println("Girilen sayi: " + num);
        int end ;
        end = num;
        ekleCikar(num, end);
    }
}

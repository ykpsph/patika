package Java101;

import java.util.Scanner;

public class HesapMakinesi {

    // topla
    static void topla(){
        Scanner input = new Scanner(System.in);
        int number;
        int result = 0;
        int i = 1;
        while(true){
            System.out.print(i++ + ". sayi: ");
            number = input.nextInt();
            if(number == 0){
                break;
            }
            result += number;
        }
        System.out.println("Sonuc: "+result);
    }
    // cikar
    static void cikar(){
        Scanner input = new Scanner(System.in);
        System.out.print("Kac adet sayi gireceksiniz: ");
        int counter = input.nextInt();
        int number;
        int result = 0;
        for(int i = 1; i <= counter; i++){
            System.out.print(i+". sayi: ");
            number = input.nextInt();
            if(i == 1){
                result += number;
                continue;
            }
            result -= number;
        }
        System.out.println("Sonuc: "+result);
    }
    // carp
    static void carp(){
        Scanner input = new Scanner(System.in);
        int number;
        int result = 1;
        int i = 1;
        while(true){
            System.out.print(i++ + ". sayi: ");
            number = input.nextInt();
            if(number == 1)
                break;
            if(number == 0){
                result = 0;
                break;
            }
            result *= number;
        }
        System.out.println("Sonuc: "+result);
    }
    // bol
    static void bol(){
        Scanner input = new Scanner(System.in);
        System.out.print("Kac adet sayi gireceksiniz: ");
        int counter = input.nextInt();
        double number;
        double result = 0.0;

        for(int i = 1; i <= counter; i++){
            System.out.print(i+". sayi: ");
            number = input.nextDouble();
            if(i != 1 && number == 0){
                System.out.println("Bolen 0 olamaz.");
                continue;
            }
            if(i == 1){
                result = number;
                continue;
            }
            result /= number;
        }
        System.out.println("Sonuc: "+result);
    }
    // us alma
    static void ust(){
        Scanner input = new Scanner(System.in);
        System.out.print("Taban degerini giriniz: ");
        int base = input.nextInt();
        System.out.print("Us degerini giriniz: ");
        int us = input.nextInt();
        int result = 1;

        for(int i = 1; i <= us; i++){
            result *= base;
        }
        System.out.println("Sonuc: "+result);
    }
    // factorial
    static void factorial(){
        Scanner input = new Scanner(System.in);
        System.out.print("Sayi giriniz: ");
        int n = input.nextInt();
        int result = 1;

        for(int i = 1; i <= n; i++){
            result *= i;
        }
        System.out.println("Sonuc: "+result);
    }
    // mod alma
    static void mod(){
        Scanner input = new Scanner(System.in);
        System.out.print("Sayiyi giriniz: ");
        int num = input.nextInt();
        System.out.print("Modu giriniz: ");
        int mod = input.nextInt();

        int result = num % mod;
        System.out.println("Sonuc: "+result);
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String menu = "1- Toplama\n"+
                "2- Cikarma\n"+
                "3- Carpma\n"+
                "4- Bolme\n"+
                "5- Uslu Sayi\n"+
                "6- Factorial\n"+
                "7- Mod\n"+
                "0- Cikis\n";
        int select;

        do {
            System.out.println(menu);
            System.out.print("Yapmak istediginiz islem numarasini giriniz: ");
            select = input.nextInt();

            switch (select){
                case 1:
                    topla();
                    break;
                case 2:
                    cikar();
                    break;
                case 3:
                    carp();
                    break;
                case 4:
                    bol();
                    break;
                case 5:
                    ust();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    mod();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Yanlis bir deger girdiniz, tekrar deneyiniz.");
            }

        } while(select != 0);
    }
}

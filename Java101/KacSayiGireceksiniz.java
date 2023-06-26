package Java101;

import java.util.Scanner;

public class KacSayiGireceksiniz {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Kac adet sayi gireceksiniz? ");
        int n = input.nextInt();

        int buyuk = 0;
        int kucuk = Integer.MAX_VALUE;
        for(int i = 1; i <= n; i++){
            System.out.print(i+". sayiyi giriniz: ");
            int num = input.nextInt();
            if(num > buyuk){
                buyuk = num;
            }
            if(num < kucuk){
                kucuk = num;
            }
        }
        System.out.println("en buyuk sayi: "+buyuk + " en kucuk sayi: "+ kucuk);
    }
}

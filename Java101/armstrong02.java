package Java101;

import java.util.Scanner;

public class armstrong02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayi giriniz: ");
        int num = scan.nextInt();
        int basamakAdeti = 0; // basamak adeti
        int basamaktakiSayi; // basamaktaki sayi
        int temp = num;
        int result = 0;
        int basamaktakiSayininKuvveti; // basamaktaki sayinin kuvveti

        while(temp != 0){
            temp = temp / 10;
            basamakAdeti++;
        }
        temp = num;
        while(temp != 0){
            basamaktakiSayi = temp % 10;
            basamaktakiSayininKuvveti = 1;
            for(int i = 1; i <= basamakAdeti; i++){
                basamaktakiSayininKuvveti *= basamaktakiSayi;
            }
            result += basamaktakiSayininKuvveti;
            temp = temp / 10;
        }
        if(result == num){
            System.out.println(num + " bir armstrong sayidir.");
        } else System.out.println(num + " bir armstrong sayisi degildir.");
    }
}

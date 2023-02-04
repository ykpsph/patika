import java.util.Scanner;

public class armstrong {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int ba = 0; //basamak adeti
        int bs; // basamaktaki sayi
        int temp = num;
        int result = 0; // sonuc
        int bsk; // basamaktaki sayinin kuvveti

        while(temp != 0){
            temp = temp / 10;
            ba++;
        }
        temp = num;
        while(temp != 0){
            bs = temp % 10;
            bsk = 1;
            for(int i = 1; i <= ba; i++){
                bsk *= bs;
            }
            result += bsk;
            temp = temp / 10;
        }
        if(result == num){
            System.out.println(num + " bir armstrong sayisidir.");
        } else System.out.println(num + " bir armstrong sayisi degildir");



//        Scanner input = new Scanner(System.in);
//        int num = input.nextInt();
//        int basamakSayisi = 0;
//        int temp = num;
//        int basamaktakiSayi;
//        int result = 0;
//        int basamaktakiSayininKuvveti;
//
//        // basamak sayisini hesapla
//        while(temp != 0){
//            temp /= 10;
//            basamakSayisi++;
//        }
//        temp = num;
//        while(temp != 0){
//            basamaktakiSayi = temp % 10;
//            basamaktakiSayininKuvveti = 1;
//            for(int i = 1; i <= basamakSayisi; i++){
//                basamaktakiSayininKuvveti *= basamaktakiSayi;
//            }
//            result += basamaktakiSayininKuvveti;
//            temp /= 10;
//        }
//        if(result == num){
//            System.out.println(num + " armstrong sayisidir.");
//        } else
//            System.out.println(num+" armstrong sayisi degildir.");

    }
}

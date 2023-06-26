package Java101;

import java.util.Arrays;
import java.util.Scanner;

public class EnYakinlar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Bir sayi giriniz: ");
        int girilenSayi = sc.nextInt();

        int kucukEnYakin = 0;
        int buyukEnYakin = 0;

        int[] arr = {15,12,788,103, 66, 43, 17, -30, 25, 1,-1,-778,2,0};
        Arrays.sort(arr);
        System.out.println("Sorted array: "+Arrays.toString(arr));

        for(int i = 0; i < arr.length; i++){
            if(girilenSayi > arr[i]){
                kucukEnYakin = arr[i];
            }
            if(arr[i] > girilenSayi){
                buyukEnYakin = arr[i];
                break;
            }
        }

        System.out.println("en yakin kucuk: "+kucukEnYakin);
        System.out.println("en yakin buyuk: "+buyukEnYakin);
    }
}
//Dizi : {15,12,788,1,-1,-778,2,0}
//Girilen Sayı : 5
//Girilen sayıdan küçük en yakın sayı : 2
//Girilen sayıdan büyük en yakın sayı : 12
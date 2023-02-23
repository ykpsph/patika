import java.util.Arrays;
import java.util.Scanner;

public class DiziElemanlariniGir {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Kac elemanli bir dizi olusturmak istiyorsunuz: ");
        int n = s.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            System.out.print(i+1 + ". elemanin degerini giriniz: ");
            arr[i] = s.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        //int[] arr = {26, 5, 2, 9, -3, 1, 6, 8};

        for(int i = 0; i < arr.length; i++){
            for(int k = i+1; k < arr.length; k++){
                if(arr[i] > arr[k]){
                    int temp = arr[i];
                    arr[i] = arr[k];
                    arr[k] = temp;
                }
            }
        }


        System.out.println("arr sorted: "+Arrays.toString(arr));
    }
}

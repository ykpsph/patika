package Java101;

import java.util.Scanner;

public class KacKereTekrar {
    public static void main(String[] args) {
        int[] arr = {10, 20, 20, 10, 10, 20, 5, 20};

        int count = 0;
        for(int i = 0; i < arr.length; i++){
            for(int k = 0; k < arr.length; k++){
                if(arr[i] == arr[k]){
                    if(k < i){
                        break;
                    }
                    count++;
                }
            }
            if(count > 0){
                //System.out.println(arr[i]+" sayisi "+ count + " kere yazilmistir.");
                System.out.printf("%d sayisi %d kere yazilmistir.\n", arr[i], count);
                count = 0;
            }
        }
    }
}
/**
 * 10 - 3 adet 10 bulunmaktadir.
 * 20 - 4 adet 20 bulunmaktadir.
 * 5 - 1 adet 5 bulunmaktadir.
 */

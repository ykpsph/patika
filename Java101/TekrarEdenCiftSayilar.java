package Java101;

import java.util.Arrays;

public class TekrarEdenCiftSayilar {
    public static void main(String[] args) {
        int[] arr = {10, 2, 3, 5, 8, 6, 22, 19, 2, 8, 23, 9, 6, 9, 22, 36};
        int[] temp = new int[arr.length];

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                if((i != j) && (arr[i] == arr[j]) && arr[i] % 2 == 0){
                    System.out.print(arr[i] + " ");
                }
            }
        }
    }
}

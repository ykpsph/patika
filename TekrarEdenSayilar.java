import java.util.Arrays;

public class TekrarEdenSayilar {
    public static void main(String[] args) {
        int[] arr = {3,7,3,3,2,9,18,21,1,33,9,1};
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                if((i != j) && (arr[i] == arr[j])){
                    System.out.print(arr[i]+" ");
                    break;
                }
            }
        }
    }
}

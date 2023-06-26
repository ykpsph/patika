package Java101;

public class TersUcgen {
    public static void main(String[] args){
        int n = 10;

        for(int i = n-1; i >= 0; i--){
            for(int j=n-i; j >= 0; j--){
                System.out.print(".");
            }
            for(int k = 2*i+1; k >= 1; k--){
                System.out.print("o");
            }
            System.out.println("");
        }
    }
}

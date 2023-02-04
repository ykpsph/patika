import java.util.Scanner;

public class Diamond {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Sayi giriniz: ");
        int n = input.nextInt();

        for (int i = 0; i <= n - 1; i++) {
            for (int j = 0; j <= n - i; j++) {
                System.out.print(".");
            }
            for (int k = 1; k <= 2 * i + 1; k++) {
                System.out.print("x");
            }
            System.out.println("");
        }
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

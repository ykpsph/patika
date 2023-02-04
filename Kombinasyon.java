import java.util.Scanner;

public class Kombinasyon {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("n: ");
        int n = input.nextInt();
        System.out.println("r: ");
        int r = input.nextInt();


        // n! / (r! * (n-r)!)
        // n factorial
        int nf = 1;
        for(int i = 1; i <= n; i++){
            nf *= i;
        }
        System.out.println(n + "! = " +nf);
        // r factorial
        int rf = 1;
        for(int i = 1; i <= r; i++){
            rf *= i;
        }
        System.out.println(r + "! = " +rf);
        // n-r factorial
        int nrf = 1;
        for(int i = 1; i <= (n-r); i++){
            nrf *= i;
        }
        System.out.println(n-r +" ! = " + nrf);
        // result
        int result = nf / (rf * (nrf));
        System.out.println(result);
    }
}

import java.util.Scanner;

public class DaireninAlani {
    public static void main(String[] args){
        int r;
        double pi = 3.14;

        Scanner input = new Scanner(System.in);

        System.out.print("Yaricap: ");
        r = input.nextInt();
        double alan = pi * r * r ;
        double cevre = 2 * pi * r;

        System.out.println("Dairenin alani: "+alan);
        System.out.println("Dairenin cevresi: "+cevre);
    }
}
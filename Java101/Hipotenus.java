package Java101;

import java.util.Scanner;

public class Hipotenus {
    public static void main(String[] args){
        int a;
        int b;
        double c;

        Scanner input = new Scanner(System.in);
        System.out.print("1.kenar: ");
        a = input.nextInt();
        System.out.print("2.kenar: ");
        b = input.nextInt();

        c = Math.sqrt((a*a) + (b*b));
        System.out.print("Hipotenus: "+c);
    }
}

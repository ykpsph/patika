package Java101;

import java.util.Scanner;

public class Manav {
    public static void main(String[] args){
        double portakal = 1.11, elma = 3.67, armut = 2.14, muz = 0.95;

        Scanner input = new Scanner(System.in);
        System.out.println("kac kg portakal aldiniz: ");
        portakal = input.nextDouble();
        System.out.println("kac kg elma aldiniz: ");
        elma = input.nextDouble();
        System.out.println("kac kg armut aldiniz: ");
        armut = input.nextDouble();
        System.out.println("kac kg muc aldiniz: ");
        muz = input.nextDouble();

        double total = portakal + elma + armut + muz;
        System.out.println("toplam tutar: "+total);



    }
}

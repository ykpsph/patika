import java.util.Scanner;

public class VucutKitleIndexi {
    public static void main(String[] args){
        double kilo;
        double boy;

        Scanner input = new Scanner(System.in);
        System.out.println("kilo: ");
        kilo = input.nextDouble();

        System.out.println("boy: ");
        boy = input.nextDouble();

        double vki = kilo / (boy*boy);
        System.out.println("vucut kitle indexiniz: " + vki);

    }
}

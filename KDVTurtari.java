import java.util.Scanner;

public class KDVTurtari {
    public static void main(String[] args){
        double tutar, kdvOrani = 0.18, kdvTutari, kdvliTutar;

        Scanner input = new Scanner(System.in);
        System.out.print("Ucret tutarini girin: ");
        tutar = input.nextDouble();

        kdvTutari = tutar * kdvOrani;
        kdvliTutar = tutar + kdvTutari;

        System.out.println("KDV'siz tutar: "+tutar);
        System.out.println("KDV orani: "+kdvOrani);
        System.out.println("KDV tutari: "+kdvTutari);
        System.out.println("KDV'li tutar: " + kdvliTutar);
    }
}

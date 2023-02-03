import java.util.Scanner;

public class NotOrtalamasi {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int mat, fizik, kimya;

        System.out.print("Matematik: ");
        mat = input.nextInt();

        System.out.print("Fizik: ");
        fizik = input.nextInt();

        System.out.print("Kimya: ");
        kimya = input.nextInt();

        int ort = (mat + kimya + fizik) / 3;
        System.out.println("Ortalama: "+ort);
    }
}

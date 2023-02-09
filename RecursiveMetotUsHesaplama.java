import java.util.Scanner;

public class RecursiveMetotUsHesaplama {
    static int usAl(int taban, int us){
        if(us == 0)
            return 1;
        else if(us < 0)
            return 0;

        return taban * usAl(taban, us-1);
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Taban: ");
        int taban = input.nextInt();

        System.out.print("Us: ");
        int us = input.nextInt();

       System.out.println("cevap: "+usAl(taban, us));

    }
}

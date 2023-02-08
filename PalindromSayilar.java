import java.util.Scanner;

public class PalindromSayilar {

    static boolean isPalindrome(int sayi){
        int  gecici = sayi;
        int cevrilmis = 0;
        int ilkBasamaktakiSayi;

        while(gecici != 0){
            System.out.println("-----------");
            System.out.println("Sayi: "+sayi);
            ilkBasamaktakiSayi = gecici % 10;
            System.out.println("Ilk basamaktaki sayi: " + ilkBasamaktakiSayi);
            cevrilmis = (cevrilmis * 10) + ilkBasamaktakiSayi;
            System.out.println("Yeni sayi: "+cevrilmis);
            gecici /= 10;
        }
        if(sayi == cevrilmis){
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int sayi = input.nextInt();
        System.out.println(isPalindrome(sayi));
    }
}
/*
 int num = 121
 int temp = num
 int reverseNum = 0
 int lastNum

 while(temp!= 0)

*/
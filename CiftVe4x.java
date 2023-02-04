import java.util.Scanner;

public class CiftVe4x {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int num;

        do {
            System.out.print("sayi giriniz: ");
            num = input.nextInt();
            if(num % 4 == 0){
                System.out.println("sam'a eklendi: "+num);
                sum += num;
            }
        } while(num % 2 == 0);
        System.out.println("4'un katlari olan sayilarin toplami: "+sum);
    }
}

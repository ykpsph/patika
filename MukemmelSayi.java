import java.util.Scanner;

public class MukemmelSayi {
    public static void main(String[] args){
        // 28 = 1 2 4 7 14
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayi giriniz: ");
        int num = input.nextInt();

        int total = 0;
        for(int i = 1; i < num; i++){
            if(num % i == 0){
                //System.out.println(i);
                total += i;
            }
        }
        System.out.println("total: "+total);
        if(total == num){
            System.out.println(num + " bir mukemmel sayidir.");
        } else
            System.out.println("degildir.");
    }
}

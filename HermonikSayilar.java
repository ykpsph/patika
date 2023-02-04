import java.util.Scanner;

public class HermonikSayilar {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        float result = 0.0F;
        for(int i = 1; i <= num; i++){
            result += 1.0/i;
        }
        System.out.println(result);

    }
}

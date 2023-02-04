import java.util.Scanner;

public class DortVeBesinKuvvetleri {
    public static void main(String[] args){
//        Scanner input = new Scanner(System.in);
//        int num;
//
//        System.out.println("Enter a number: ");
//        num = input.nextInt();
//
//        int power = 1;
//        for(int i = 0; i <= num; i++){
//            for(int j = 0; j < i; j++){
//                power *= num;
//            }
//            System.out.println(num+" ^^ " + i + " = " + power);
//            power = 1;
//        }
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        for(int i = 1; i <= num; i++){
            if(i % 4 == 0 || i % 5 == 0){
                System.out.println(i);
            }
        }
    }
}

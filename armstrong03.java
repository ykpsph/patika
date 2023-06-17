import java.util.Scanner;

public class armstrong03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int numberOfDigits = 0;
        int digit;
        int temp = num;
        int result = 0;
        int powerOfDigit;

        while(temp != 0){
            temp /= 10;
            numberOfDigits++;
        }
        temp = num;

        while(temp != 0){
            digit = temp % 10;
            powerOfDigit = 1;
            for(int i = 1; i <= numberOfDigits; i++){
                powerOfDigit *= digit;
            }
            result += powerOfDigit;
            temp = temp / 10;
        }
        if(result == num){
            System.out.println(num + " armstrong sayidir.");
        } else System.out.println(num + " armstrong sayi degildir.");

    }
}
//        Determine how many digits are in the number. Call that n.
//        Then take every digit in the number and raise it to the n power.
//        Add all those together,and if your answer is the original number then it is an Armstrong number.
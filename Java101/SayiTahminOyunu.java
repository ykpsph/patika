package Java101;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SayiTahminOyunu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int randomNumber = (int) (Math.random() * 10);
        int chances = 5;
        boolean isWin = false;
        boolean isValid = false; // hatali giris yapip yapmadigina bak.

        int[] yourGuesses = new int[chances];
        int guess;
        int i = 0;
        while(chances > 0){
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();

            if(guess < 0 || guess > 99){
                System.out.println("Lutfen 0-99 araliginda bir sayi giriniz.");
                if(isValid){
                    chances--;
                    System.out.println("Hatali Giris ! Kalan hak: "+chances);
                } else {
                    isValid = true;
                    System.out.println("Birdahaki bilincli yanlis giriste hakkinizdan dusulecektir.");
                }
                continue; // bu aralikta degilse asagidaki islemleri yapmadan basa donsun.
            }
            chances--;

            if(guess == randomNumber){
                System.out.println("Dogru tahmin ettiniz: " + guess);
                isWin = true;
                break;
            } else if(guess < randomNumber){
                System.out.println("Sayiyi artirin: "+guess + " kalan hak: "+chances);

            } else if((guess > randomNumber) && chances >= 1){
                System.out.println("Sayiyi azaltin: "+guess + " kalan hak: "+chances);
            }
            yourGuesses[i] = guess;
            i++;
        }

        if(!isWin){
            System.out.println("Game over!");
            if(!isValid){
                System.out.println(Arrays.toString(yourGuesses) + " dogru sayi: "+randomNumber);
            }
        }
    }
}


/*
    - 0 ile 100 arasinda rastgele bir sayi olustur.
    -
 */
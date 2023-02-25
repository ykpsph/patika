import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        aboutGame();
        gameMenu();

    }

    public static void runGame() {
        Scanner sc = new Scanner(System.in);

        int randomNumber = (int) (Math.random() * 100);
        int chances = 5;
        System.out.println(randomNumber);

        while (chances > 0) {
            chances--;
            System.out.print("Enter your guess: ");
            int guess = sc.nextInt();

            if(guess == randomNumber){
                System.out.println("Dogru tahmin ettiniz: " + guess);
                break;
            } else if(guess < randomNumber){
                System.out.println("! ARTIR !"+guess + " kalan hak: "+chances);
            } else if(guess > randomNumber){
                System.out.println("! AZALT !"+guess + " kalan hak: "+chances);
            } else {
                System.out.println("\nMalesef kaybettiniz! Doğru Cevap : " + randomNumber + "\n");
            }
            System.out.println("---------------------------");
        }
        gameMenu();
    }


    public static void gameMenu(){
        Scanner sc = new Scanner(System.in);

        String gameMenu = "1 - Oyuna basla\n" + "2 - Cikis";
        System.out.println(gameMenu);

        int wrongInput = 0;
        boolean option = false; // 1 || 2 ? true : false;

        while(!option){
            if(wrongInput > 0){
                System.out.println("Secenek 1 veya 2'yi seciniz.");
            }
            System.out.print("Ne yapmak istiyorsunuz? ");
            int selection = sc.nextInt();

            if(selection == 1){
                option = true;
                runGame();
            } else if(selection == 2){
                option = true;
                System.out.println("Cikis yapiliyor, hoscakal!");
            }
            wrongInput++;
        }
        sc.close();
    }


    public static void aboutGame(){
        System.out.println("\nOyun Kurallari :\n" +
                "------------------------------------------------------------------------------------ \n" +
                " 1) 0-100 araliginda rastgele bir sayi uretilecek. \n" +
                " 2) Sayiyi dogru tahmin etmek icin 5 hakkininiz vardir. \n" +
                " 3) Yaptiginiz tahmine gore yardim alacaksiniz. \n" +
                "------------------------------------------------------------------------------------ \n");
    }

}

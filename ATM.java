import java.util.Scanner;

public class ATM {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int right = 3;
        int balance = 3000;
        int select;
        String username;
        String password;

        while(right > 0){
            System.out.print("Kullanici adi: ");
            username = input.nextLine();
            System.out.println("Parola: ");
            password = input.nextLine();
            if(username.equals("patika") && password.equals("dev0101")){
                System.out.println("Merhaba, hangi islemi yapmak istiyorsunuz? ");
                do {
                    System.out.println("1-Para yatirma\n"+
                            "2-Para cekme\n"+
                            "3-Bakiye sorgula\n"+
                            "4-Cikis");
                    select = input.nextInt();
                    if(select == 1){
                        System.out.println("Para miktari: ");
                        int price = input.nextInt();
                        balance += price;
                    } else if (select == 2){
                        System.out.println("Para miktari: ");
                        int price = input.nextInt();
                        if(price > balance){
                            System.out.println("Bakiye yetersiz.");
                        } else {
                            balance -= price;
                        }
                    } else if(select == 3){
                        System.out.println("Bakiyeniz: "+balance);
                    }
                } while(select != 4);
                System.out.println("Tekrar gorusmek uzere.");
                break;
            } else {
                right--;
                System.out.println("Hatali kullanici adi veya sifre. Tekrar deneyiniz.");
                if(right == 0){
                    System.out.println("Hesabiniz bloke olmustur. Banka ile iletisime geciniz.");
                } else {
                    System.out.println("Kalan hakkiniz: "+ right);
                }
            }
        }
    }
}

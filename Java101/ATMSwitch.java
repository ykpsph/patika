package Java101;

import java.util.Scanner;

public class ATMSwitch {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int right = 3;
        int balance = 3000;
        int select;
        String username;
        String password;


        while(right > 0) {
            System.out.print("Kullanici adiniz: ");
            username = input.nextLine();
            System.out.print("Parolaniz: ");
            password = input.nextLine();
            if(username.equals("patika") && password.equals("dev01")){
                System.out.println("Bankamiza hosgeldiniz.");
                do{
                    System.out.println("Hangi islemi yapmak istiyorsunuz? ");
                    System.out.println("1-Para yatirma\n"+
                            "2-Para cekme\n"+
                            "3-Bakiye sorgula\n"+
                            "4-Cikis");
                    select = input.nextInt();
                    switch (select){
                        case 1:
                            System.out.println("Yatirilacak Para miktari: ");
                            int price = input.nextInt();
                            balance += price;
                            break;
                        case 2:
                            System.out.println("Cekilecek Para miktari: ");
                            price = input.nextInt();
                            if(price > balance){
                                System.out.println("Bakiye yetersiz.");
                            } else {
                                balance -= price;
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz: "+balance);
                        case 4:
                            System.out.println("Tekrar gorusmek uzere.");
                            break;
                    }
                }while(select != 4);

            }else {
                System.out.println("Tekrar deneyin.");
            }
            right--;
        }
    }
}

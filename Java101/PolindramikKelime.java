package Java101;

import java.util.Scanner;

public class PolindramikKelime {
//    public static void main(String[] args) {
//        String str = "alalala";
//        str = str.toLowerCase();
//        System.out.println(isPolindrome(str));
//    }
//    public static boolean isPolindrome(String str){
//        String rts = "";
//        boolean result = false;
//
//        for(int i = str.length()-1; i>=0; i--){
//            rts = rts + str.charAt(i);
//        }
//        if(str.equals(rts)){
//            result = true;
//        }
//        return result;
//    }
    public static boolean isPolindromeString(String str){
        StringBuilder sb = new StringBuilder();
        String rts = "";
        rts = str;
        sb.append(str);
        sb.reverse();
        str = sb.toString();

        return rts.equals(str);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        if(isPolindromeString(str)){
            System.out.println("tersi de ayni");
        } else
            System.out.println("tersi ayni degil");
    }
}

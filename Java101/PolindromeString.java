package Java101;

import java.util.Scanner;

public class PolindromeString {
    public static void isPolindrome(String str){
        StringBuilder sb = new StringBuilder();

        System.out.println(str.length());
        for(int i = str.length()-1; i >= 0; i--){
            sb.append(str.charAt(i));
            System.out.println(sb);
        }
        if(sb.toString().equals(str)){
            System.out.println("polindome");
        } else
            System.out.println("not polindrome");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        isPolindrome(str);
    }
}


//    String rts = "";
//
//        for(int i = str.length()-1; i >= 0; i--){
//                rts = rts + str.charAt(i);
//                }
//                if(rts.equals(str)){
//                System.out.println("polindome");
//                } else
//                System.out.println("not polindrome");
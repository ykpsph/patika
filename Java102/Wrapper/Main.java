package Java102.Wrapper;

public class Main {
    public static void main(String[] args){
        int a = 1;
        String b = "2";

        System.out.println(a+b); //12

        int c = Integer.parseInt(b);
        System.out.println(a+c);//3
    }
}

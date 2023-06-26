package Java102.Generics;

public class Main {
    public static void main(String[] args){
//        Nullable<String> x = new Nullable<>("AS");
//        x.run();

        Integer a = 1;
        String b = "patika";
        Double c = 2.3;

        Test<Integer, String, Double> t = new Test<>(a,b,c);
        t.showInfo();

    }
}

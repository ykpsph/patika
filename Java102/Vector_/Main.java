package Java102.Vector_;

import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Vector<String> v = new Vector<String>();
        v.add("Izmir");
        v.add("Ankara");
        v.add("Istanbul");
        v.add("Adana");

        for(int i = 0; i < v.size(); i++){
            System.out.println("v: "+v.get(i));
        }

        System.out.println("Indexi 2 olan eleman: "+v.get(2));
        v.add(0, "some");

        for(int i = 0; i < v.size(); i++){
            System.out.println("v: "+v.get(i));
        }
    }
}

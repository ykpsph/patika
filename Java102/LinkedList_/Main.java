package Java102.LinkedList_;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> l = new LinkedList<String>();
        l.add("aaa");
        l.add("bbb");
        l.add("ccc");
        l.add("ddd");

        System.out.println("index'i 2 olan eleman: "+l.get(2));

        // liste basina ekle
        l.add("a");
    }
}

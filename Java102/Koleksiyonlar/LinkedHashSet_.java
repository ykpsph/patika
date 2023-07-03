package Java102.Koleksiyonlar;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSet_ {
    public static void main(String[] args) {
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(1);
        linkedHashSet.add(9);
        linkedHashSet.add(5);

        for (Integer integer : linkedHashSet) {
            System.out.println(integer);
        }
    }
}

package Java102.Koleksiyonlar;

import java.util.HashSet;
import java.util.Iterator;

public class Set_HashSet {
    public static void main(String[] args) {
        HashSet<Integer> hSet = new HashSet<>();
        hSet.add(3);
        hSet.add(44);
        hSet.add(5);
        hSet.add(9);

        for(Integer i : hSet){
            System.out.println(i);
        }

        System.out.println("size: "+hSet.size());
        //System.out.println(hSet.isEmpty());
        System.out.println(hSet.contains(44));
        hSet.remove(9);

        for(Integer i : hSet){
            System.out.println(i);
        }
        //hSet.clear();
        System.out.println("Cleared ? " + hSet.isEmpty());
        System.out.println("----------------------");

        Iterator<Integer> itr = hSet.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}

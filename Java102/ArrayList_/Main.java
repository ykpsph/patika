package Java102.ArrayList_;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<String> nameList = new ArrayList<String>();
        nameList.add("Bako");
        nameList.add("Yako");
        nameList.add("Zako");
        nameList.add("Tako");
        nameList.add("Rako");
        nameList.add("Yako");
        nameList.add("Lako");
        nameList.add(null);
        System.out.println(nameList); // tum listeyi ekrana yazdir

        System.out.println("Size: "+nameList.size()); // eleman sayisi
        System.out.println("index 1 deki eleman: "+nameList.get(1));
        System.out.println("index 2 deki eleman: "+nameList.get(2));

        System.out.println("Ilk gecen Yako'nun indexi : "+nameList.indexOf("Yako"));
        System.out.println("Sondan taramaya baslayarak son noktadaki Yako'nun indexi: "+nameList.lastIndexOf("Yako"));

        nameList.add(0, "Oako"); // o index'e eleman koyar
        System.out.println(nameList);
        nameList.set(0, "YYako"); // o index'teki elemani degistirir.
        System.out.println(nameList);
        nameList.set(nameList.size()-1, "NOT NULL");
        System.out.println(nameList);

        System.out.println("Jako var mi ?"+nameList.contains("Jako")); // var mi yok mu?

        System.out.println("remove(0)"+nameList.remove(0));
        System.out.println("---------------------");
        List<String> newNameList = new ArrayList<String>();
        newNameList.add("Bardak");
        newNameList.add("Surahi");

        nameList.addAll(newNameList); // (0, newNameList)'te yapabilirdim.
        System.out.println("nameList yeni hali : "+nameList);

        System.out.println("nameList'ten bir subList olusturalim: ");
        List<String> subNameList = nameList.subList(0, 4); // start dahil end dahil degil.
        System.out.println("subNameList: "+subNameList);
        System.out.println("nameList: "+nameList);

        nameList.clear(); // listedeki tum elemanlari siler
        System.out.println(nameList);
    }
}

package Java102.odev;

public class Main {
    public static void main(String[] args) {
        MyList<Integer> l = new MyList<>();
        System.out.println("Liste durumu: "+(l.isEmpty() ? "Empty" : "Not empty"));
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        l.add(6);
        l.add(7);
        System.out.println("Liste durumu: "+(l.isEmpty() ? "Empty" : "Not empty"));

        System.out.println("Index: "+l.indexOf(4));
        System.out.println("Index: "+l.indexOf(8));
        System.out.println("Index: "+l.indexOf(2));

        Object[] dizi = l.toArray();
        System.out.println("Object dizisinin ilk elemani: "+dizi[0]);
        MyList<Integer> subList = l.subList(0,3);
        System.out.println(subList.toString());

        System.out.println("Listede 2 var mi ? "+l.contains(2));
        System.out.println("Listede 8 var mi ? "+l.contains(8));

        l.clear();
        System.out.println(l.toString());
    }
}

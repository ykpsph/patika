package Java102.GenericBoundedTypes;

public class Main {
    public static void main(String[] args) {
        // Integer Double Float extends Number

        //Nullable<Integer> n1 = new Nullable<>(12);
        //n1.run();

        A obj1 = null;
        Nullable<A> n1 = new Nullable<>(obj1);
        n1.run();

    }
}

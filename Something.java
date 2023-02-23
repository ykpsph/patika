import java.util.Arrays;

public class Something {
    public static void main(String[] args) {
        int[] liste = {6, 1, 55, 21, 33, -321, -21, 2, -11, 27};

        //Arrays.sort(liste);
        System.out.println(Arrays.toString(liste));

        int index = Arrays.binarySearch(liste, 2);
        System.out.println("33'ün indeksi :" + index);
    }
}

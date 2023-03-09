import java.util.Scanner;

/*
 [x] Cift boyutlu diziler uzerinden oynanmali ve MineSweeper sinifi icerisinde tasarlanmali.
 [x] Matris boyutunu yani satir ve sutun sayisini kullanici belirlemeli.
 [x] diziye ait eleman sayisinin ceyregi (elemanSayisi / 4) kadar rastgele mayin yerlestirilmeli.
 Ornegin dizi 4x3 boyutunda ise eleman sayisi (satirSayisi * sutunSayisi) formulu ile hesaplamali
 ve boyutu 12 olmali. Bu durumda mayin sayisi 12/4=3 adet olmalidir. (ipucu: bu mayinlarin konumlarini tutacak
 ikinci bir dizi olusturabilirsiniz.)
 [] Kullanici matris uzerinden bir nokta secmeli. Nokta secimi icin satir ve sutun degerlerini girmeli.
 [] Secilen noktanin dizinin sinirlari icerisinde olup olmadigini kontrol edilmeli ve kosul saglanmazsa
 tekrar nokta istenmeli
 [] Kullanicinin girdigi noktada mayin var ise oyunu kaybetmeli.
 [] Mayin yok ise, ilgili noktaya degen tum konumlarina bakilmali : sagi, solu, yukarisi, asagisi, sol ust capraz,
 sag ust capraz, sag alt apraz, sol alt capraz) ve etrafindaki mayinlarin sayisinin toplami ilgili noktaya yazilmali.
 Noktaya degen herhangi bir mayin yok ise "0" degeri atamali.
 [] Kullanici hic bir mayina basmadan tum noktalari secebilirse oyunu kazanmali.
 */
public class MayinTarlasi {
    public static void main(String[] args) {
//        oyun basladiginda kullanici row ve column sayilarini girsin.
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the row number: ");
//        int rowNumber = sc.nextInt();
//        System.out.print("Enter the column number: ");
//        int columnNumber = sc.nextInt();
//
//        MineSweeper mineSweeper = new MineSweeper(rowNumber, columnNumber);
        MineSweeper mineSweeper = new MineSweeper(4,4);
        mineSweeper.run();
    }
}

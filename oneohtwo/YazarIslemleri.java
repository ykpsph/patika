package oneohtwo;

public class YazarIslemleri {
    private static Yazar[] yazarlar;

    static {
        yazarlar = new Yazar[2];
        yazarlar[0] = new Yazar("Necip Fazil", "Kisakurek");
        yazarlar[1] = new Yazar("Halit", "Usakligil");
    }

    public static Yazar[] getYazarlar() {
        return YazarIslemleri.yazarlar;
    }
}

package Java102.finalkeyword;

public class Daire {
    public int r;
    final double PI = 3.14;

    public Daire(int r){
        this.r = r;
    }

    public void alan_hesapla(){
        double area = PI * this.r * this.r;
        System.out.println("Dairenin alani: "+area);
    }
}

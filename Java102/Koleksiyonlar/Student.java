package Java102.Koleksiyonlar;

public class Student {
    private String name;
    private int puan;

    public Student(String name, int puan) {
        this.name = name;
        this.puan = puan;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPuan() {
        return puan;
    }

    public void setPuan(int puan) {
        this.puan = puan;
    }
}

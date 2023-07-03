package Java102.Koleksiyonlar;

import java.util.Comparator;

public class OrderByPuan implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getPuan() - o2.getPuan();
    }
}

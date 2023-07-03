package Java102.Koleksiyonlar;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet_ {
    public static void main(String[] args) {
        //TreeSet<Student> students = new TreeSet<>(new OrderByPuan());
        TreeSet<Student> students = new TreeSet<>(new OrderByName());
        students.add(new Student("yako", 60));
        students.add(new Student("pako", 40));
        students.add(new Student("tako", 90));

        Iterator<Student> itr = students.iterator();

        while(itr.hasNext()){
            System.out.println(itr.next().getName());
        }
        System.out.println("---");
        for(Student s : students){
            System.out.println(s.getName());
        }
    }
}


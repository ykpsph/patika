package Java101;

public class Course {
    Teacher teacher;
    String name;
    String code; // TRH101
    String prefix; // TRH
    int point;


    Course(String name, String code, String prefix){
        this.name = name;
        this.code = code;
        this.prefix = prefix;

        this.point = 0;
    }

    void addTeacher(Teacher t){
        if(t.subject.equals(this.prefix)){
            this.teacher = t;
            System.out.println("Ogretmen ekleme basarili: ");
            printTeacherInfo();
            System.out.println("-----");
        } else {
            System.out.println("Eklenmek istenen ogretmenin bransi uygun degil.");
        }
    }
    void printTeacherInfo(){
        this.teacher.printTeacher();
    }

}

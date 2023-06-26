package Java101;

public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name;
    int stuNo;
    String year;
    double avarage;
    boolean isPassed;

    Student(String name, int stuNo, String year, Course c1, Course c2, Course c3){
        this.name = name;
        this.stuNo = stuNo;
        this.year = year;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.avarage = 0.0;
        this.isPassed = false;
    }

    void addBulkExamPoints(int point1, int point2, int point3){
        if(point1 >= 0 && point1 <= 100){
            this.c1.point = point1;
        }
        if(point2 >= 0 && point2 <= 100) {
            this.c2.point = point2;
        }
        if(point3 >= 0 && point3 <= 100){
            this.c3.point = point3;
        }
    }

    void printPoints(){
        System.out.println(this.name + " 'in ders notlari");
        System.out.println(this.c1.name + ": " + this.c1.point);
        System.out.println(this.c2.name + ": " + this.c2.point);
        System.out.println(this.c3.name + ": " + this.c3.point);
    }

    void isPass(){
        this.avarage = (this.c1.point + this.c2.point + this.c3.point) / 3.0;
        if(avarage > 55){
            System.out.println(this.name + " sinifi gecmistir.");
        } else {
            System.out.println(this.name + " sinifi gecememistir.");
        }
    }
}

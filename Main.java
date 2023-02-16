public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Necmi", "11111111", "TRH");
        Teacher t2 = new Teacher("Fevzi", "22222222", "FZK");
        Teacher t3 = new Teacher("Riza", "33333333", "KMY");

        Course tarih = new Course("Tarih", "100001", "TRH");
        Course fizik = new Course("Fizik", "100002", "FZK");
        Course kimya = new Course("Kimya", "100003", "KMY");
        tarih.addTeacher(t1);
        fizik.addTeacher(t2);
        kimya.addTeacher(t3);


        Student s1 = new Student("Inek Saban", 1001, "4.sinif", tarih, fizik, kimya);
        s1.addBulkExamPoints(35, 45, 60);
        s1.printPoints();
        s1.isPass();

    }
}

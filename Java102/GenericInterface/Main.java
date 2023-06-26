package Java102.GenericInterface;

public class Main {
    public static void main(String[] args) {
        Student<String> student = new Student<>();
        student.add("X");
        student.update("Y");
        student.delete("Z");
        student.select();
    }
}

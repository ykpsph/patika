public class Teacher {
    String name;
    String phoneNo;
    String subject;

    Teacher(String name, String phoneNo, String subject){
        this.name = name;
        this.phoneNo = phoneNo;
        this.subject = subject;
    }

    void printTeacher(){
        System.out.println("Name: "+this.name+
                " Phone: "+this.phoneNo+
                " Subject: "+this.subject);
    }
}

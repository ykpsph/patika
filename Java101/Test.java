package Java101;

public class Test {
    public Test(){
        System.out.printf("1"); // 1.
        new Test(10);
        System.out.printf("5"); // 5.
    }
    public Test(int temp){
        System.out.printf("2"); // 2.
        new Test(10,20);
        System.out.printf("4"); // 4.
    }
    public Test(int data, int temp){
        System.out.printf("3"); // 3.
    }
    public static void main(String[] args) {
        Test obj = new Test();
    }
}

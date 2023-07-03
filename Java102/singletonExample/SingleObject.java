package Java102.singletonExample;

public class SingleObject {
    private static SingleObject instance = new SingleObject(); // SingleObject turunden instance adinda bir nesne uret.

    private SingleObject(){}


    static {
        try {
            instance = new SingleObject();
        } catch (Exception e){
            throw new RuntimeException("Exception occurred in creating singleton instance");
        }
    }
    public static SingleObject getInstance(){
        return instance;
    }

    public void showMessage(){
        System.out.println("Hi!");
    }



}

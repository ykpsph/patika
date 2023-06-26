package Java102.Generics;

public class NullableInt {
    private final Integer value;

    public NullableInt(Integer value){
        this.value = value;
    }
    public Integer getValue(){
        return value;
    }


    public boolean isNull(){
        return this.getValue() == null;
    }

    public void run(){
        if(isNull()){
            System.out.println("Bu degiskene deger atanmamistir.(null)");
        } else {
            System.out.println(this.getValue());
        }
    }
}

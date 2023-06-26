package Java102.GenericInterface;

public class Student <T> implements Database <T>{

    @Override
    public void add(T data) {
        System.out.println("Veri eklendi. "+data);
    }

    @Override
    public void delete(T data) {
        System.out.println("Veri silindi. "+data);
    }

    @Override
    public void update(T data) {
        System.out.println("Veri guncellendi. "+data);
    }

    @Override
    public T select() {
        System.out.println("Veri secildi. ");
        return null;
    }
}

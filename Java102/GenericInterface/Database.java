package Java102.GenericInterface;

public interface Database <T> {
    void add(T data);
    void delete(T data);
    void update(T data);
    T select();
}

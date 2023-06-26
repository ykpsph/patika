package Java102.odev;

import java.util.Arrays;

public class MyList<T>{
    private int capacity = 10; // baslangic boyutu
    private int count = 0;
    private Object[] myList;

    public MyList(){
        this.myList = new Object[this.capacity]; // default capacity
    }

    public MyList(int capacity){
        this.myList = new Object[capacity]; // capacity'i parametreden aliyor
    }

    // dizinin kapasite degerini dondurur.
    public int getCapacity(){
        return this.myList.length;
    }

    // dizideki eleman sayisini verir.
    public int getSize(){
        return this.count;
    }

    // diziye eleman ekler.
    public void add(T data){
        if(myList.length <= count){ // dizide yer yoksa dizi boyutunu iki katina cikar
            this.myList = Arrays.copyOf(myList, myList.length * 2);
        }
        myList[count] = data;
        count++;
    }

    // verilen indexteki degeri dondurur.
    public Object getValue(int index){
        if(index < 0 || index > count){
            return null;
        }
        else {
            return myList[index];
        }
    }

    // verilen indexteki degeri siler ve diziyi sola kaydirir.
    public Object remove(int index){
        if(index < 0 || index >= count){
            return null;
        }
        else {
            for(int i = index; i < count; i++){
                myList[i] = myList[i+1];
            }
            myList[count] = null;
            count -= 1;
            return myList;
        }
    }

    // verilen indexteki veriyi gunceller
    public Object update(int index, T data){
        Object temp;
        if(index < 0 || index > count){
            return null;
        }
        else {
            temp = myList[index];
            myList[index] = data;
            return temp;
        }
    }

    // sinifa ait dizideki elemanlari listeleyen metod.
    public String toString(){
        StringBuilder s = new StringBuilder("[");
        for(int i = 0; i < count; i++){
            s.append(myList[i].toString());
            if(i == count - 1) break;
            s.append(",");
        }
        return s+"]";
    }


    // parametre olarak gelen nesnenin indeksini verir.
    public int indexOf(T data){
        for(int i = 0; i < count; i++){
            if(myList[i] == data){
                return i;
            }
        }
        return -1;
    }

    public int lastIndexOf(T data){
        for(int i = count - 1; i>= 0; i--){
            if(myList[i] == data){
                return i;
            }
        }
        return -1;
    }

    // listenin bos olup olmadigini soyler.
    public boolean isEmpty(){
        return count == 0;
    }

    // listedeki ogeleri bir myListay haline getirir. ??????????
    public Object[] toArray(){
        return myList;
    }

    // Listedeki butun ogeleri siler, listeyi bos hale getirir.
    public void clear(){
        myList = Arrays.copyOf(myList, 0);
        myList = Arrays.copyOf(myList, 10);
        count = 0;
    }


    // parametrede verilen index araliginda bir liste doner.
    public MyList<T> subList(int start, int end){
        MyList<T> temp = new MyList<>();
        for(int i = start; i <= end; i++){
            temp.add((T) getValue(i)); // (T) ?
        }
        return temp;
    }

    // parametrede verilen degerin dizide olup olmadigini soyler.
    public boolean contains(T data){
        return indexOf(data) != -1;
    }
}

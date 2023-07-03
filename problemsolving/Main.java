package problemsolving;

import java.util.*;


public class Main {
    public static void main(String[] args) {
        List<Object> unsafeList = new ArrayList<Object>();
        List<Object> safeList = Collections.synchronizedList(unsafeList);

        synchronized(safeList){
            Iterator<Object> iterator = safeList.iterator();
            while(iterator.hasNext()){
                System.out.println(iterator.next());
            }
        }
    }
}

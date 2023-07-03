package Java102.PriorityQueue_;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        Comparator<Integer> compareEven = new Comparator<Integer>() {
            public int compare(Integer i, Integer j){
                int result = i % 2 - j % 2;
                if(result == 0){
                    result = i-j;
                }
                return result;
            }
        };
        PriorityQueue<Integer> pq = new PriorityQueue<>(20, compareEven);
        for(int i = 0; i<20; i++){
           pq.offer(20-i);
        }

        for(int i = 0; i<20; i++){
            System.out.println("\t"+pq.poll());
        }
    }
}

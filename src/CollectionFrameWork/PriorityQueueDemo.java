package CollectionFrameWork;

import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue pq=new PriorityQueue();

        pq.add(10);
        pq.add(20);
        pq.add(500);
        pq.add(30);
        pq.add(100);
        pq.add(10); //Allow Duplication

//        pq.add("Gokul"); Mixed are not allow

        System.out.println(pq);

    }
}

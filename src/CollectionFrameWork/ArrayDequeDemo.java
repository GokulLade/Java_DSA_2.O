package CollectionFrameWork;

import java.util.ArrayDeque;

public class ArrayDequeDemo {
    public static void main(String[] args) {
        ArrayDeque ad=new ArrayDeque();

        ad.add(100);
        ad.add(200);
        ad.add(300);
        ad.add(200); //Allow Duplication

        ad.offer(540); //Using offer() method
        ad.offerFirst(10);
        ad.offerLast(500);

        System.out.println(ad);

        ArrayDeque ad1=new ArrayDeque();

        ad1.add("Gokul"); //Mixed data is possible
        ad1.add("lade");
        ad1.addLast(11.2); //Last index insert
        ad1.addFirst(100); //First index insert

//        ad1.add(3,120);  Index base accessing are not allow.

        ad.addAll(ad1); //Add one collection in another collection

        System.out.println(ad1);

        System.out.println(ad);
    }


}

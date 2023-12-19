package CollectionFrameWork;

import java.util.*;

public class CollectionsClassDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Gokul");
        list.add("Aniket");
        list.add("Shreyas");
        list.add("Nagesh");

        System.out.println(list);
        Collections.sort(list); //sort the list
        System.out.println(list);

        Collections.reverse(list); //reverse the list
        System.out.println(list);

        Collections.shuffle(list); //shuffle the list
        System.out.println(list);

        ArrayList<Integer> al=new ArrayList<Integer>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(3);
        al.add(5);
        System.out.println(al);

        int f=Collections.frequency(al,3); //Check the frequency of the value
        System.out.println(f);

        Collections.rotate(al,2);
        System.out.println(al);



    }
}

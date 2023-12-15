package CollectionFrameWork;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet ts=new TreeSet();

        ts.add(125);
        ts.add(72);
        ts.add(24); //Not allow duplication
        ts.add(86);
        ts.add(300);
        ts.add(24);
        ts.add(10);

        System.out.println(ts);

        System.out.println("Highest value Present in Tree set than 86 object is ="+ ts.higher(86));

        System.out.println("Lower value Present in Tree set than 86 object is ="+ ts.lower(86));

        System.out.println("Highest value Present in Tree set than 15 is ="+ ts.ceiling(15));  //This value is not present in tree set
        System.out.println("Lower value Present in Tree set than 15 is ="+ ts.floor(15));    //This value is not present in tree set

    }
}

package CollectionFrameWork;

import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap tm=new TreeMap();

        Integer i=new Integer(120);

        tm.put(100, "Gokul");
        tm.put(200, "lade");
        tm.put(300, 11.2);
        tm.put(i, 100); //Not Allow Duplication

        System.out.println(tm);
    }
}

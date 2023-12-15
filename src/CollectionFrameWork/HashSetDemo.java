package CollectionFrameWork;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet hs=new HashSet();

        hs.add(100);
        hs.add(20);
        hs.add(130);
        hs.add(143);
        hs.add(111);
        hs.add(100); //Duplicate are not allow.

        System.out.println(hs); //order of insertion  are preserve.
    }
}

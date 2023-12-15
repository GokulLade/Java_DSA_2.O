package CollectionFrameWork;
import java.util.*;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet ls=new LinkedHashSet();

        ls.add(100);
        ls.add(20);
        ls.add(130);
        ls.add(143);
        ls.add(111);
        ls.add(100); //Duplicate are not allow.

        System.out.println(ls); //order of insertion  are preserve.


    }
}

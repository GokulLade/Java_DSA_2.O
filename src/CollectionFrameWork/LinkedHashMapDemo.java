package CollectionFrameWork;
import java.util.*;

public class LinkedHashMapDemo {
    public static void main(String[] args)
    {
        LinkedHashMap lh=new LinkedHashMap();
        lh.put(01,"Gokul");
        lh.put(02,"Aniket");
        lh.put(03,"Shreyas");
        lh.put(04,"Chetany");
        lh.put(05,"Nagesh");

        lh.put(null,null);// Also accepts null values

        System.out.println(lh);

    }
}

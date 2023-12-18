package CollectionFrameWork;
import java.util.Hashtable;

public class HashTableDemo {
    public static void main(String[] args) {
        Hashtable hm=new Hashtable();
//        hm.put(100,"Gokul");
        hm.put(20,"Aniket");
        hm.put(300,"Shreyas");
        hm.put(200,"Aniket"); //Allow Duplication
        hm.putIfAbsent(100,"Gokul"); //put if the key is absent
       // hm.put(null,"Gokul"); null value is not allowed(NullPointerException)

        System.out.println(hm);
    }
}

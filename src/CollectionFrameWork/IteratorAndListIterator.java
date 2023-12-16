package CollectionFrameWork;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorAndListIterator {
    public static void main(String[] args) {
        ArrayList al=new ArrayList();

        al.add(89);
        al.add("Gokul");
        al.add("Lade");
        al.add('A');

        System.out.println("Using For Loop =");
        for (int i=0;i<al.size();i++)
        {
            System.out.println(al.get(i));
        }

        System.out.println();
        System.out.println("Using Foreach Loop =");
        for (Object obj:al)
        {
            System.out.println(obj);
        }
        System.out.println();

        System.out.println("Using Iterator Method = ");
        Iterator it= al.iterator();

        while(it.hasNext())
        {
            System.out.println(it.next());
        }
        System.out.println();

        System.out.println("Using ListIterator Method = ");

        ListIterator lit =al.listIterator(al.size()); //Define the size in parameter using size() method.

        while (lit.hasPrevious())
        {
            System.out.println(lit.previous());
        }
    }
}

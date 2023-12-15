package CollectionFrameWork;

import java.util.*;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList al=new ArrayList();

        al.add(100); //Same type of data
        al.add(200);
        al.add(300);
        al.add(200);    //Same duplication data

        System.out.println(al);

        ArrayList al1=new ArrayList();

        al1.add("Gokul"); //Mixed type of data
        al1.add('A');
        al1.add(11.2);

        al1.add(0,120); //Specific location of index array

        System.out.println(al1);


        al1.addAll(al); //Add one collection in another collection
        System.out.println(al1);

    }
}

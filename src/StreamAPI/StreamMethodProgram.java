package StreamAPI;

import java.util.stream.Stream;
import java.util.*;

public class StreamMethodProgram {
    public static void main(String[] args)
    {

        List list=Arrays.asList(8,3,5,12,9,4,15,20);

        Stream<Integer> listStream=list.stream();

//        long count=listStream.count();
//
//        System.out.println(count);

//        Stream<Integer> sortStream= listStream.sorted();
//
//        Stream<Integer> filterStream=sortStream.filter(n->n%2==0);
//
//
//        Stream<Integer> mapStream=filterStream.map(n->n*n);
//
//        mapStream.forEach(n-> System.out.println(n));

        Stream<Integer> opStream= listStream.filter(n->n%2==0).sorted().map(n->n*n);
        opStream.forEach(n-> System.out.println(n));

    }
}

package BasicProgram;

import java.util.*;
import java.util.function.Consumer;

public class forEachMethodProgram {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(12,32,42,65,31,56);

        /*.......Using foreach loop........*/

//        for(Integer i :list)
//        {
//            System.out.println(i);
//        }

        /*.......Using Anonymous inner class loop........*/

//        Consumer<Integer> consumer = new Consumer<Integer>()
//        {
//            @Override
//            public void accept(Integer i)
//            {
//                System.out.println(i);
//            }
//        };
//
//        list.forEach(consumer);

        /*.......Using Lambda expression........*/

//        Consumer<Integer> consumer = i-> System.out.println(i);
//
//        list.forEach(consumer);

        /*.......Using Lambda expression in forEach() method........*/

        list.forEach(i-> System.out.println(i));

    }
}

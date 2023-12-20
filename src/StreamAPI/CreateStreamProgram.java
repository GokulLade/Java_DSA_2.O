package StreamAPI;

import java.util.*;
import java.util.stream.Stream;

public class CreateStreamProgram {
    public static void main(String[] args)
    {
        List<Integer> list=Arrays.asList(50,23,44,15,72,36,94,25);

        Stream<Integer> listStream=list.stream();

        listStream.forEach(n-> System.out.println(n));

    }
}

package CollectionFrameWork;

import java.util.ArrayList;

public class GenericsDemo {
    public static void main(String[] args)
    {
        Student s1 = new Student();
        Student s2 = new Student();

        Employee e1 = new Employee();


        ArrayList<Student> st = new ArrayList<Student>();
        st.add(s1);
        st.add(s2);

        //st.add(e1);   store only Student type of data

    }
}
class Student {
    private String name;
    private int id;

}
class Employee {
    private String name;
    private int id;
}

package CollectionFrameWork;
import java.util.*;

public class ComparableDemo {
    public static void main(String[] args) {
        Student2 s1=new Student2(07,"Gokul",190);
        Student2 s2=new Student2(20,"Aniket",170);
        Student2 s3=new Student2(05,"Shreyas",220);

        List list=new ArrayList();
        list.add(s1);
        list.add(s2);
        list.add(s3);

        System.out.println(list);

        Collections.sort(list);

        System.out.println(list);
    }
}
class Student2 implements Comparable<Student2>
{
    String name;
    int marks;
    int rollno;

    public Student2(int rollno,String name,int marks)
    {
        this.rollno=rollno;
        this.name=name;
        this.marks=marks;
    }

    public int getRollno()
    {
        return rollno;
    }

    public String getName()
    {
        return name;
    }

    public int getMarksmarks()
    {
        return marks;
    }

    @Override
    public String toString() //To convert the data in to str
    {
        return " "+rollno+" "+name+" "+marks;
    }

    @Override
    public int compareTo(Student2 s2)
    {
        if(this.rollno>s2.rollno)
            return 1;
        else
            return -1;
    }

}

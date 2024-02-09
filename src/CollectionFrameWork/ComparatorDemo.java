package CollectionFrameWork;
import java.util.*;

public class ComparatorDemo {
    public static void main(String[] args)
    {
        Student1 s1=new Student1(07,"Gokul",190);
        Student1 s2=new Student1(20,"Aniket",170);
        Student1 s3=new Student1(05,"Shreyas",220);

        List list=new ArrayList();
        list.add(s1);
        list.add(s2);
        list.add(s3);

        System.out.println(list);

        Comparator<Student1> com=(Student1 s4,Student1 s5)->{       //Using lambda function
            if(s4.rollno>s5.rollno)
                return 1;
            else
                return -1;
        };


        Collections.sort(list,com);

        System.out.println(list);


    }
}
//Create external class

//class SortData implements Comparator<Student1>
//{
//    public int compare(Student1 s1,Student1 s2)
//    {
//        if(s1.rollno>s2.rollno)
//            return 1;
//        else
//            return -1;
//    }
//}
//Student1 Class define
class Student1{
    String name;
    int marks;
    int rollno;

    public Student1(int rollno,String name,int marks)
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
    public String toString() //To convert the data in to string
    {
        return " "+rollno+" "+name+" "+marks;
    }
}

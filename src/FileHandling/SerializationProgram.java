package FileHandling;

import java.io.*;


class StudentData implements Serializable
{
    int id;
    String name;
    transient int marks;

    public StudentData(int id, String name, int marks)
    {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public void disp()
    {
        System.out.println(id);
        System.out.println(name);
        System.out.println(marks);
    }
}

public class SerializationProgram {
    public static void main(String[] args) throws IOException
    {
        FileOutputStream fos = new FileOutputStream("Information/Object.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        ObjectOutputStream oos = new ObjectOutputStream(bos);

        StudentData s1 = new StudentData(101, "Gokul", 90);
        StudentData s2 = new StudentData(102, "Aniket", 110);

        oos.writeObject(s1);
        oos.writeObject(s2);

        System.out.println("Object Store Successfully..");

        oos.flush();
        oos.close();
    }
}


package FileHandling;

import java.io.*;

public class DeserializationProgram {
    public static void main(String[] args) throws Exception
    {
        FileInputStream fis = new FileInputStream("Information/Object.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);
        ObjectInputStream ois = new ObjectInputStream(bis);

        StudentData s1 = (StudentData) ois.readObject();
        StudentData s2 = (StudentData) ois.readObject();
        s2.disp();
        s1.disp();
    }
}

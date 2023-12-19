package FileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterProgram{
    public static void main(String[] args) throws Exception
    {

        File f=new File("Information/File1.txt"  );
        FileWriter fw=new FileWriter(f,true);
        fw.write("Hello My name is Gokul");
        fw.write("\n");
        fw.write(65);//Store in the Form of Ascii value
        fw.write("\n");
        char ch[]={'P', 'A', 'T', 'I', 'L'};fw.write(ch);

        fw.close();

        System.out.println("Data written successfully..");
    }
}


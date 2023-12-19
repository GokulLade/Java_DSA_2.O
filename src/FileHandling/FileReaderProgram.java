package FileHandling;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderProgram {
    public static void main(String[] args) throws IOException
    {
        FileReader fr=new FileReader("Information/File1.txt");

        //First way to read the information

        /*
            int i;
            while((i=fr.read())!=-1)
            {
                System.out.print((char)i);
            }
       */

        // Second way to read the information

        File f=new File("Information/File1.txt");

        char ch[]=new char[(int)f.length()];

        fr.read(ch);

        for(char c : ch)
        {
            System.out.print(c);
        }
    }
}

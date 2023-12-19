package FileHandling;

import java.io.*;
public class PrintWriterProgram {
    public static void main(String[] args) throws IOException
    {
        File f=new File("Information/File2.txt");
        FileWriter fw=new FileWriter(f,true);
        PrintWriter pw=new PrintWriter(fw);

        pw.println("Hello My name is Gokul");
        pw.println("I am a BCA(Sci) Student.");
        char ch[]={'D', 'I', 'T', 'M', 'S'};
        pw.println(ch);

        pw.close();

        System.out.println("Data written successfully..");
    }
}

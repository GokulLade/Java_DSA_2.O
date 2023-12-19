package FileHandling;
import java.io.*;

public class BufferedWriterProgram {
    public static void main(String[] args) throws Exception
    {
        File f=new File("Information/File2.txt");
        FileWriter fw=new FileWriter(f,true);
        BufferedWriter bw=new BufferedWriter(fw);

        bw.write("Hello My name is Gokul");
        bw.newLine();
        bw.write("I am a BCA(Sci) Student.");
        bw.newLine();
        char ch[]={'D', 'I', 'T', 'M', 'S'};
        bw.write(ch);

        bw.close();

        System.out.println("Data written successfully..");

    }
}

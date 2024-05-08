package FileHandling;
import java.io.*;
public class FileDemo1{
    public static void main(String args[]) throws Exception
    {

        File f=new File("A.txt");
        f.createNewFile();
        FileInputStream fis=new FileInputStream(f);
        FileOutputStream fos=new FileOutputStream(f);

        int n=0;
        while((n=System.in.read())!=-1)
        {
            fos.write(n);
            fos.close();

        }

        int n1=0;
        while((n1=fis.read())!=-1)
        {
            System.out.println((char)n1);
            fis.close();
        }


    }
}
package FileHandling;
import java.io.*;

public class CreateFileFolder {
    public static void main(String[] args)
    {

        //Created folder

        String dirName="Information";
        File dir = new File(dirName);
        if(dir.exists())
        {
            System.out.println("The folder is already exists..");
        }
        else {
            dir.mkdir();
            System.out.println("The folder is created..");
        }

        //Created file-1

        String fileName ="File1.txt";
        File file = new File(dirName,fileName);
        if(file.exists())
        {
            System.out.println("The file is already exists..");
        }
        else {
            try {
                file.createNewFile();
                System.out.println("The file is created..");
            }
            catch (IOException e)
            {
                System.out.println(e.getMessage());
            }
        }

        //Created file-2

        String fileName2 ="File2.txt";
        File file2 = new File(dirName,fileName2);
        if(file2.exists())
        {
            System.out.println("The file is already exists..");
        }
        else {
            try {
                file2.createNewFile();
                System.out.println("The file is created..");
            }
            catch (IOException e)
            {
                System.out.println(e.getMessage());
            }
        }

        //Create file-3 for storing objects

        String fileName3 ="Object.txt";
        File file3 = new File(dirName,fileName3);
        if(file3.exists())
        {
            System.out.println("The file is already exists..");
        }
        else {
            try {
                file3.createNewFile();
                System.out.println("The Object file is created..");
            }
            catch (IOException e)
            {
                System.out.println(e.getMessage());
            }
        }

        //Check who many files exist in the directory

        int count = 0;
        String str[]=dir.list();

        for(int i=0;i<str.length;i++)
        {
            System.out.println(str[i]);
            count++;
        }
        System.out.println("The fiel are present in the directory = " + count);
    }

}

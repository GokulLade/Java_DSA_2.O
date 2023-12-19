package FileHandling;

import java.io.*;

public class BufferedReaderProgram {
    public static void main(String[] args) throws Exception
    {
        File f=new File("Information/File2.txt");
        FileReader fr= new FileReader(f);
        BufferedReader br=new BufferedReader(fr);
        String line=br.readLine();

        while(line!=null)
        {
            System.out.println(line);
            line=br.readLine();
        }
    }
}

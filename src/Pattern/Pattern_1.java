package Pattern;

public class Pattern_1 {
    public static void main(String args[])
    {
        int n=5;
        for(int i=0;i<=n;i++) // i=rows
        {
            for(int j=0;j<=n;j++) // j=column
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

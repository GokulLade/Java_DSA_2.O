package Pattern;

public class Pattern_2
{
    public static void main(String args[])
    {
        int n=5;
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=n;j++) // i=rows
            {
                if(i==0 || j==0 || i==n-1 || j==n-1)  // j=column
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

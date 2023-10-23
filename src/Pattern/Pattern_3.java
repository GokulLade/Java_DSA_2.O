package Pattern;

public class Pattern_3 {
    public static void main(String args[])
    {
        int n=5;
        
        System.out.println("H Printing Using nested loops");
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=n;j++) {
                if (i ==(n-1)/2 && j<3|| j == 0 || j == n-1)
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

        System.out.println("L Printing Using nested loops");
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=n;j++) {
                if (i==5 || j==0)
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

        System.out.println("O Printing Using nested loops");
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=n;j++) {
                if (j==0 &&i>1 && i<5 || i==1 && j>1 && j<4 ||j==4 && i>1 && i<5 || i==5 && j>0 && j<3 )
                {
                    System.out.print("* ");
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

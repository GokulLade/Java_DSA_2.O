package Pattern;

public class Pattern_4 {
    public static void main(String args[])
    {
        int n=15;
        System.out.println("Line 1");
        System.out.println();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i+j==(n-1)/2)
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

        System.out.println("Line 2");
        System.out.println();
        for(int i=0;i<n;i++)
        {
            for (int j = 0; j < n; j++)
            {
                if (i - j == (n - 1) / 2)
                {
                    System.out.print("*");
                } else
                {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }

        System.out.println("Line 3");
        System.out.println();
        for(int i=0;i<n;i++)
        {
            for (int j = 0; j < n; j++)
            {
                if (j-i==(n-1)/2)
                {
                    System.out.print("*");
                } else
                {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }

        System.out.println("Line 4");
        System.out.println();
        for(int i=0;i<n;i++)
        {
            for (int j = 0; j < n; j++)
            {
                if (i+j==(n-1)+(n-1)/2)
                {
                    System.out.print("*");
                } else
                {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }

        System.out.println("All lines");
        System.out.println();
        for(int i=0;i<n;i++)
        {
            for (int j = 0; j < n; j++)
            {
                if (i+j==(n-1)/2 || i-j==(n-1)/2 || j-i==(n-1)/2 || i+j==(n-1)+(n-1)/2 )
                {
                    System.out.print("*");
                } else
                {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }

        System.out.println("Print X");
        System.out.println();
        for(int i=0;i<n;i++)
        {
            for (int j = 0; j < n; j++)
            {
                if (i==j || i+j==(n-1))
                {
                    System.out.print("*");
                } else
                {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }

    }
}

package BasicProgram;

import java.util.Scanner;

public class LambdaExpressionDemo
{
    public static void main(String[] args)
    {
        LambdaDemo ld=()->{

            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the Number ");
            int n=sc.nextInt();

            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                {
                    if(j==0 || i==(n-1) || i>=j)
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
        };

        ld.Pattern();
    }
}

interface LambdaDemo{
    void Pattern();
}

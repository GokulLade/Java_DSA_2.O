package DSA_Programs.TimeComplexity;

//Finding Time Complexity

import java.util.Scanner;

public class TimeComplexities {
    public static void main(String[] args)
    {
        // Time Complexity = 0(1)
            for(int i=1;i<10;i++)
            {
                System.out.println("TimeComplexity");
            }

        // Time Complexity = 0(n)
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of N");
        n=sc.nextInt();
        for(int i=1;i<n;i++)
        {
            System.out.println("TimeComplexity");
        }

        // Time Complexity = 0(n*n)
        for(int i=1;i<n;i++)
        {
            for(int j=1;j<n;j++)
            {
                System.out.println("TimeComplexity");
            }

        }


    }
}

package BasicProgram;

import java.util.Scanner;

public class FibonacciProgram {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Limit");
        int n=sc.nextInt();

        int n1=0,n2=1,n3=0;
        System.out.print(" "+n1+" "+n2);

        for (int i=1;i<n;i++)
        {
            n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        }

    }
}

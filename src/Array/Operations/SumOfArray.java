package Array.Operations;

import java.util.Scanner;

public class SumOfArray {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        int a[]=new int[5];

        int i,sum=0;

        System.out.println("Enter the value for Array Element  : ");
        for (i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }

        System.out.println("Your Array Element are : ");
        for(i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }

        System.out.print("Sum of array Element is : ");
        for (i=0;i<a.length;i++)
        {
            sum=a[i]+sum;
        }
        System.out.print(sum);
    }
}

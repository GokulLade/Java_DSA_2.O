package Array.Operations;

import java.util.Scanner;

public class SumOfArray {
    public static void main(String[] args)
    {
        //Crete Scanner class ref
        Scanner sc=new Scanner(System.in);

        //Array Declaration
        int a[]=new int[5];

        //Variable Declaration
        int i,sum=0;

        //Input Array Element
        System.out.println("Enter the value for Array Element  : ");
        for (i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }

        //Print Array Element
        System.out.println("Your Array Element are : ");
        for(i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }

        //Sum of Array Element
        System.out.print("Sum of array Element is : ");
        for (i=0;i<a.length;i++)
        {
            sum=a[i]+sum;
        }
        System.out.print(sum);
    }
}

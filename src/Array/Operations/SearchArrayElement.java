package Array.Operations;

import java.util.Scanner;

public class SearchArrayElement {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        int arr[]=new int[6];

        System.out.println("Enter Array Element : ");
        for (int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }

        System.out.println("Please Enter Array Element which you want to search ");
        int search=sc.nextInt();

        int yes=0,pos=0;
        for (int i=0;i<arr.length;i++)
        {
            if(arr[i]==search)
            {
                pos=i;
                yes++;
            }
        }

        if(yes>0)
        {
            System.out.println("Element is Fount "+yes+" times at position "+pos);
        }
        else
        {
            System.out.println("Element not Found ");
        }
    }
}

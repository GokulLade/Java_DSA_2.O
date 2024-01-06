package Array.Operations;

import java.util.Scanner;

public class CopyArrayElements {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        //Array Declaration
        int a[]=new int[5];
        int b[]=new int[5];

        //Declare variable
        int i;

        //Input Array Element
        System.out.println("Enter Array Element : ");
        for (i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }

        //Copy Array Element
        for (i=0;i<a.length;i++)
        {
            a[i]=a[i];
        }

        //Print Array Element
        System.out.println("Array Element Are : ");
        for(int arr : a)
        {
            System.out.println(arr);
        }

    }
}

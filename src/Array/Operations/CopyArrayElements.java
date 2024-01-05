package Array.Operations;

import java.util.Scanner;

public class CopyArrayElements {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        //Array Declaration
        int arr1[]=new int[5];
        int arr2[]=new int[5];

        //Declare variable
        int i;

        //Input Array Element
        System.out.println("Enter Array Element : ");
        for (i=0;i<arr1.length;i++)
        {
            arr1[i]=sc.nextInt();
        }

        //Copy Array Element
        for (i=0;i<arr1.length;i++)
        {
            arr2[i]=arr1[i];
        }

        //Print Array Element
        System.out.println("Array Element Are : ");
        for(int arr : arr2)
        {
            System.out.println(arr);
        }

    }
}

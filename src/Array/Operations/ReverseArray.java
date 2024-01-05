package Array.Operations;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int arr[]=new int[7];

        System.out.println("Enter Array Element : ");
        for (int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }

        System.out.println("Array Element Are : ");
        for (int b:arr)
        {
            System.out.println(b);
        }

        System.out.println("Reverse Array Element Are : ");
        for (int i= arr.length-1;i>=0;i--)
        {
            System.out.println(arr[i]);
        }


    }
}

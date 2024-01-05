package Array.Operations;

import java.util.Scanner;

public class UserArraySize {
    public static void main(String[] args) {

        //Create Scanner class ref
        Scanner sc=new Scanner(System.in);

        //Input Array size from user
        System.out.println("Enter Array size ");
        int size=sc.nextInt();

        //Declare Array
        int arr[]=new int [size];

        //Input Array Element
        System.out.println("Please Enter Array Element : ");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }

        //Print Array Element
        System.out.println("Array Element are : ");
        for(int b : arr)
        {
            System.out.println(b);
        }
    }
}

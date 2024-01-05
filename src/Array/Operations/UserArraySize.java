package Array.Operations;

import java.util.Scanner;

public class UserArraySize {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Array size ");
        int size=sc.nextInt();
        int arr[]=new int [size];

        System.out.println("Please Enter Array Element : ");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }

        System.out.println("Array Element are : ");
        for(int b : arr)
        {
            System.out.println(b);
        }
    }
}

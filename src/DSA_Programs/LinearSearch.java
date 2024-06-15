package DSA_Programs;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of the Array");
        n=sc.nextInt();

        int arr[]=new int[n];

        System.out.println("Enter the Array Element");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter the Target Element");
        int x=sc.nextInt();
        int idx=-1;

        for(int i=0;i<n;i++)
        {
            if(arr[i]==x) {
                idx = i;
                break;
            }
        }

        if(idx==-1)
        {
            System.out.println("Element Not Found in an Array");
        }
        else{
            System.out.println("Element is Fount in an Array at location : "+idx);
        }
    }
}

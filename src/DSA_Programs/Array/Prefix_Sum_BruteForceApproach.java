package DSA_Programs.Array;

import java.util.Scanner;
class Prefix_sum
{
    public static int prefix_sum1(int arr[][],int r1,int c1,int r2,int c2)
    {
        int sum=0;
        for(int i=r1;i<=r2;i++)
        {
            for(int j=c1;j<=c2;j++)
            {
                sum+=arr[i][j];
            }

        }
        return sum;

    }

}

public class Prefix_Sum_BruteForceApproach {
    public static void main(String[] args) {
        Prefix_sum p=new Prefix_sum();
        int arr[][]={
                        {1,1,1,1},
                        {1,1,1,1},
                        {1,1,1,1},
                        {1,1,1,1}
                    };

        int r1,r2,c1,c2;

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter R1 value");
        r1=sc.nextInt();
        System.out.println("Enter C1 value");
        c1=sc.nextInt();
        System.out.println("Enter R2 value");
        r2=sc.nextInt();
        System.out.println("Enter C2 value");
        c2=sc.nextInt();

        int sum=p.prefix_sum1(arr,r1,c1,r2,c2);

        System.out.println("The sum of the specified submatrix is: " + sum);


    }
}

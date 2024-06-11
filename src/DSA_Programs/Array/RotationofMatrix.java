package DSA_Programs.Array;

import java.util.Arrays;

public class RotationofMatrix {

    public static void roted(int arr[][])
    {
        int row=arr.length;

        int column=arr[0].length;

        //Transpose of Matrix[row <==> column]
        for(int i=0;i<row;i++)
        {
            for(int j=i;j<column;j++)
            {
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }

        //Swap the left and right side element
        for(int i=0; i<row;i++)
        {
            int left=0;
            int right=column-1;

            while(left<right)
            {
                int temp=arr[i][left];
                arr[i][left]=arr[i][right];
                arr[i][right]=temp;

                left++;
                right--;
            }
        }
    }

    public static void main(String[] args)
    {
        int arr[][]={
                        {1,2,3},
                        {4,5,6},
                        {7,8,9}
                    };

        roted(arr);

        for(var arr1:arr)
        {
            System.out.println(Arrays.toString(arr1));
        }
    }
}


package Array;

//Time Complexity=0(n)
//Space Complexity=0(1)
public class MissingElement {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,6,7};
        int n=arr.length;
        n=n+1;//Because array Starting is 0 index

        int sum_Nature_Number=n*(n+1)/2; //Sum of Nature number to Array Index

        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];//Sum of Present Nature Number
        }
        int sum_current_array =sum;

        int missingElement=sum_Nature_Number-sum_current_array;

        System.out.println("Missing Element is = "+missingElement);


    }
}

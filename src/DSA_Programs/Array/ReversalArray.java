package DSA_Programs.Array;
//Time Complexity=0(n)
//Space Complexity=0(1)
public class ReversalArray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int n=arr.length;


        for(int i=0;i<n/2;i++)
        {
            int temp=arr[i];
            arr[i]=arr[n-i-1];
            arr[n-i-1]=temp;
        }

        System.out.println("Reversal Array is : ");
        for (int i=0;i<n;i++)
        {
            System.out.print(" "+arr[i]);
        }
    }
}

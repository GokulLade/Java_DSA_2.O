package DSA_Programs.Array;
//Time Complexity=0(n)
//Space Complexity=0(1)
public class DuplicateElementArray {
    public static void main(String[] args) {
        int arr[]={12,3,2,13,43,12,3};

        int n=arr.length;

        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]==arr[j])
                {
                    System.out.println("Duplicate Element is : " + arr[i]);
                }
            }
        }
    }
}

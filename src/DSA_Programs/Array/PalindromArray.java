package DSA_Programs.Array;

//Time Complexity=0(n)
//Space complexity=0(1)
public class PalindromArray {
    public static void main(String[] args) {
        int arr[]={1,2,3,2,1};

        int count=0;
        int n=arr.length;

        for(int i=0;i<n/2;i++)
        {
            if(arr[i]!=arr[n-i-1])
            {
                System.out.println("Number is Not Palindrom");

            }
            else
            {
               count++;
            }

        }
        if(count>0)
        {
            System.out.println("Number is  Palindrom");
        }

    }
}

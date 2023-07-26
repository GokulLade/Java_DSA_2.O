package Array;

public class Array2D {
    public static void main(String[] args)
    {
        //2D Array Declaration
        int a[][]={{20,30,40,50},{10,40},{11,22,33}}; //Jagged Array

        //Simple Printing
        System.out.println(a[0][0]);
        System.out.println(a[0][1]);
        System.out.println(a[1][0]);
        System.out.println(a[1][1]);

        //Using for-each loop
        for(int a1[] : a)
        {
            for(int a2 : a1)
            {
                System.out.print(a2+" ");
            }
            System.out.println();
        }

    }
}

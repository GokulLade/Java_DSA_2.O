package Array;

public class Array1D {
    public static void main(String args[])
    {
        //Array Declaration
        int a[]={10,20,30};

        int b[]=new int[2];
        b[0]= 40;
        b[1]= 50;


        //Simple printing
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);

        System.out.println(b[0]);
        System.out.println(b[1]);

        //Using For-each loop printing
        for(int a1 : a)
        {
            System.out.println(a1);
        }

        for(int b1  : b)
        {
            System.out.println(b1);
        }
    }
}

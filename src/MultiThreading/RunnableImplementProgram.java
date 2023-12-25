package MultiThreading;

import java.util.Scanner;

public class RunnableImplementProgram
{
    public static void main(String[] args)
    {

        //Runnable is a functional interface so you can direct define by using Lambda expression.

                        /*  First Method Define  */

        Runnable r1=()->{

            Scanner sc=new Scanner(System.in);

            System.out.println("Enter the first Number");
            int a=sc.nextInt();

            System.out.println("Enter the Second Number");
            int b=sc.nextInt();

            int res=a+b;

            System.out.println("The Addition of Two Number is = "+res);

        };

                        /*  Second Method Define */

        //Runnable is a functional interface so you can direct define by using Lambda expression.
        Runnable r2=()->{
            System.out.println("********** If your not Enter the input in 5sec Then The Next Program will be Execute **********");
            try {
                Thread.sleep(5000); //Five-Second delay
            } catch (InterruptedException e)
            {
                System.out.println(e.getMessage());
            }
            for(int i=0;i<5;i++)
            {

                for(int j=0;j<5;j++)
                {
                    if(i==0 || j==(5-1)/2)
                    {
                        System.out.print("*");
                    }
                    else
                    {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        };

        Thread t1=new Thread(r1);
        Thread t2=new Thread(r2);

        t1.start();
        t2.start();

    }
}

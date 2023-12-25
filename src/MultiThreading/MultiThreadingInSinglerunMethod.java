package MultiThreading;

import java.util.Scanner;

public class MultiThreadingInSinglerunMethod {
    public static void main(String[] args)
    {
        MyThread t1=new MyThread();

        Thread t=Thread.currentThread();
        t.setName("Addition");

        t1.start();

    }
}
class MyThread extends Thread{
    @Override
    public void run()
    {
        String threadName=Thread.currentThread().getName();

        if(threadName.equals("Addition"))
        {
            add1();
        }
        else
        {
            pattern();
        }

    }

    public void add1()
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the first Number");
        int a=sc.nextInt();

        System.out.println("Enter the Second Number");
        int b=sc.nextInt();

        int res=a+b;

        System.out.println("The Addition of Two Number is = "+res);
    }

    public void pattern()
    {
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
    }
}

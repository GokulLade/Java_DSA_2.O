package MultiThreading;

import java.util.Scanner;

public class ThreadExtendProgram {
    public static void main(String[] args)
    {
      Add a=new Add();

      Pattern p=new Pattern();

      a.start();
      p.start();

    }
}

class Add extends Thread{
    public void run()
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the first Number");
        int a=sc.nextInt();

        System.out.println("Enter the Second Number");
        int b=sc.nextInt();

        int res=a+b;

        System.out.println("The Addition of Two Number is = "+res);

    }
}

class Pattern extends Thread{
    public void run()
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
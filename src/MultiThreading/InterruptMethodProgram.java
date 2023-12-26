package MultiThreading;

public class InterruptMethodProgram {
    public static void main(String args[])
    {
        Runnable r=()->{
            for(int i=2;i<=20;i=i+2)
            {
                System.out.println(i);
                try {
                    Thread.sleep(3000);
                }
                catch (InterruptedException e)
                {
                    System.out.println("Enter in Interrupted Exception..");
                    for(int n=0;n<5;n++)
                    {
                        for(int j=0;j<5;j++)
                        {
                            if(n==0 || j==(8-1)/2)
                            {
                                System.out.print("*");
                            }
                            System.out.print(" ");
                        }
                        System.out.println();
                    }

                }
            }
        };

        Thread t=new Thread(r);
        t.start();
        t.interrupt(); //This Method throws interrupted Exception

    }
}


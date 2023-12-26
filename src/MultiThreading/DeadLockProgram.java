package MultiThreading;

public class DeadLockProgram {
    public static void main(String[] args)
    {
        Library d=new Library();

        Thread t1=new Thread(d);
        Thread t2=new Thread(d);

        t1.setName("Student1");
        t2.setName("Student2");

        t1.start();
        t2.start();
    }
}
class Library implements Runnable{

    final String rs1= "JAVA Book";
    final String rs2= "SQL Book";
    final String rs3= "DSA Book";
    @Override
    public void run()
    {
        String threadName=Thread.currentThread().getName();//Get Thread Name

        if(threadName.equals("Student1")) //Check If thread is Student1
        {
            try
            {
                Thread.sleep(3000);
                synchronized (rs1)
                {
                    System.out.println("Student 1 acquire "+rs1);

                    Thread.sleep(3000);
                    synchronized (rs2)
                    {
                        System.out.println("Student 1 acquire "+rs2);

                        Thread.sleep(3000);
                        synchronized (rs3)
                        {
                            System.out.println("Student 1 acquire "+rs3);
                        }
                    }
                }
            }
            catch (InterruptedException i)
            {
                System.out.println(i.getMessage());
            }
        }
        else
        {
            try
            {
                Thread.sleep(3000);
                synchronized (rs3)
                {
                    System.out.println("Student 2 acquire "+rs3);

                    Thread.sleep(3000);
                    synchronized (rs2)
                    {
                        System.out.println("Student 2 acquire "+rs2);

                        Thread.sleep(3000);
                        synchronized (rs1)
                        {
                            System.out.println("Student 2 acquire "+rs1);
                        }
                    }
                }
            }
            catch (InterruptedException i)
            {
                System.out.println(i.getMessage());
            }
        }
    }
}

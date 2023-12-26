package MultiThreading;

public class join_IsAliveMethod {
    public static void main(String[] args) throws InterruptedException
    {
        System.out.println("Main Method Start");

        PrintNumber pn=new PrintNumber();
        PrintChar pc=new PrintChar();

        Thread t=new Thread(pn);
        pc.start();
        pc.join();

        System.out.println(t.isAlive());
        t.start();
        System.out.println(t.isAlive());

        System.out.println("Main Method End");
    }
}
class PrintNumber implements Runnable{
    @Override
    public void run()
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println(i);
        }
    }
}
class PrintChar extends Thread{
    @Override
    public void run()
    {
        for (char i='A';i<='Z';i++)
        {
            System.out.println(i);
        }
    }
}

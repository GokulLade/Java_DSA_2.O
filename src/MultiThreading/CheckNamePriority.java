package MultiThreading;

public class CheckNamePriority {
    public static void main(String[] args)
    {
        System.out.println("Main Method");

        System.out.println("Before Changing ");

        String threadName= Thread.currentThread().getName();    //For Check Name
        System.out.println("The Name of the thread is = "+threadName);

        int threadPriority=Thread.currentThread().getPriority();    //For Check Priority
        System.out.println("The Priority of the Thread is  = "+threadPriority);

        System.out.println("After Changing ");

        Thread t=Thread.currentThread();
        t.setName("MyThread");  //Change the name of the thread
        t.setPriority(3);   //Change the priority of the thread

        String newtThreadName= Thread.currentThread().getName();    //For Check Name
        System.out.println("The Name of the thread is = "+newtThreadName);

        int newThreadPriority=Thread.currentThread().getPriority();    //For Check Priority
        System.out.println("The Priority of the Thread is  = "+newThreadPriority);






    }
}

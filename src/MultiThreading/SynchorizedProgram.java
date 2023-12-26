package MultiThreading;

public class SynchorizedProgram {
    public static void main(String[] args)
    {
        ParentCar car=new ParentCar();

        Thread t1=new Thread(car);
        Thread t2=new Thread(car);
        Thread t3=new Thread(car);

        t1.setName("Son-1");
        t2.setName("Son-2");
        t3.setName("Son-3");

        t1.start();
        t2.start();
        t3.start();
    }
}

class ParentCar implements Runnable{

            /* Synchronized Method */
    @Override
    synchronized public void run() /* If you are use the synchronized keyword with method, so it is not need to add synchronized block
                                    this is example only */
    {
        String sonName=Thread.currentThread().getName();

        System.out.println(sonName+" Entered in Parking lot..");

                /* Synchronized Block */
        synchronized (this)
        {
            System.out.println(sonName+" Started to Drive the Car..");
            System.out.println(sonName+" Come back and parked the car..");
        }

    }

}

package OOPs.Encapsulation;

public class EncapsulationDemo {
    public static void main(String[] args) {
        EncapDemo ed=new EncapDemo();
        ed.add();

    }
}

//Class is the best Example of Encapsulation
class EncapDemo{
    private final int a=20;
    private final int b=40;

    public void add()
    {
        System.out.println("The addtion of two number is = "+(a+b));
    }
}
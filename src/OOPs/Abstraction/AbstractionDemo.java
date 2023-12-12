package OOPs.Abstraction;

public class AbstractionDemo {
    public static void main(String[] args) {
        Tiger t=new Tiger();
        t.eat();

    }
}
abstract class AbstractDemo{
    abstract void eat();
}
class Tiger extends AbstractDemo{
   @Override
    void eat()
    {
        System.out.println("Tigers eat a varied diet that includes deer, wild boar, water buffalo");
    }
}

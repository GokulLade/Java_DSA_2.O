package OOPs.Abstraction;

public class DefaultInterfaceM {
    public static void main(String[] args) {
        DefaultDemo dd=new DefaultDemo1();
        dd.add();
        dd.sum();
    }
}

interface DefaultDemo{
    void sum();
    default void add()
    {
        System.out.println("Default Method in Interface");
    }
}
class DefaultDemo1 implements DefaultDemo{
    @Override
    public void sum()
    {
        System.out.println("Overriding interface method..");
    }
}

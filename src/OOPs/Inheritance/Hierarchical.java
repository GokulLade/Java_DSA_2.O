package OOPs.Inheritance;

public class Hierarchical {
    public static void main(String[] args) {
        Child1 c1=new Child1();
        c1.add();

        Child2 c2=new Child2();
        c2.sub();

        Child3 c3=new Child3();
        c3.mul();

    }
}
class Parent1{
    //Variable Declaration
    protected int a=10;
    protected int b=20;
}
class Child1 extends Parent1{
    void add()
    {
        System.out.println("Add = "+(a+b));
    }

}
class Child2 extends Parent1{
    void sub()
    {
        System.out.println("Sub = "+(a-b));
    }

}
class Child3 extends Parent1{
    void mul()
    {
        System.out.println("Mul = "+(a*b));
    }

}

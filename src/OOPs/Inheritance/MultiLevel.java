package OOPs.Inheritance;

public class MultiLevel {
    public static void main(String[] args) {
        Demo3 d3=new Demo3();
    }
}
class Demo{

}
class Demo1 extends Demo{

}
class Demo2 extends Demo1{
    Demo2()
    {
        System.out.println("MultiLevel Inheritance..");
    }
}
class Demo3 extends Demo2{

}

package OOPs.Polymorphicm;

public class OverloadingDemo {
    public static void main(String[] args) {
        OverDemo od=new OverDemo();

        int twoAdd=od.add(10,20);
        System.out.println("Addition of two Number is = "+twoAdd);

        int threeAdd=od.add(10,20,30);
        System.out.println("Addition of three Number is = "+threeAdd);

    }
}
class OverDemo{
    int add(int a,int b)
    {
        return a+b;
    }
    int add(int a,int b,int c)
    {
       return a+b+c;
    }
}

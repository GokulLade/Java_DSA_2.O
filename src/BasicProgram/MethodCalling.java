package BasicProgram;

import java.util.Scanner;

public class MethodCalling {
    public static void main(String[] args) {

        ASMD_Operations op=new ASMD_Operations();
        op.add();

    }
}

class Input{
    protected int a;
    protected int b;
    void input()
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the First Number..");
        a=sc.nextInt();

        System.out.println("Enter the Second Number..");
        b=sc.nextInt();
    }
}
class ASMD_Operations extends Input{
    void add()
        {
            super.input();      //Method Calling
            System.out.println("The addition of two number is = "+(a+b));
            sub();
            mul();
            div();
        }

    void sub()
    {
        System.out.println("The subtraction of two number is = "+(a-b));
    }


    void mul()
    {
        System.out.println("The multiplication of two number is = "+(a*b));
    }

    void div()
    {
        System.out.println("The division of two number is = "+(a/b));
    }
}

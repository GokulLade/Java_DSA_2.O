package BasicProgram;

import java.util.Scanner;

public class ExtendsImplementsProgram {

    public static void main(String[] args)
    {
        Addition1 ad=new Addition1();
        ad.input();
        ad.add();
        ad.mul();

    }
}

class Input1{
    int a,b;
    public void input()
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter First Number");
        a=sc.nextInt();
        System.out.println("Enter Second Number");
        b=sc.nextInt();
    }
}
interface Operations1{
    void add();
}

interface Operations2{
void mul();
}

class Addition1 extends Input1 implements Operations1,Operations2 { //Extends the class and Implements the interface in one class

    int c;
    @Override
    public void add()
    {
        c=a+b;
        System.out.println("The Addition of two number is = "+c);
    }
    @Override
    public void mul()
    {
        c=a*b;
        System.out.println("The Addition of two number is = "+c);

    }
}

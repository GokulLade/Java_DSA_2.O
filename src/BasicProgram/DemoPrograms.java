package BasicProgram;

import java.util.Scanner;

public class DemoPrograms {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        PrintVar obj = new PrintVar();
        obj.callMethod();

        Check c=new Check();
        c.add();
        c.add(10);

        MultipleArg mn=new MultipleArg();
        mn.mul();//Send zero arguments
        mn.mul(10);
        mn.mul(10,4,23,21);
        mn.mul(11,32,1,12,90);//Send multiple arguments

        System.out.println("Enter a character");
        char ch=sc.next().charAt(0);

        CheckChar ck=new CheckChar(ch);



    }
}
// Access Private Methods in inteface
interface DefineVar{
    int a=20;
    int b=39;

    private void print()
    {
        System.out.println(a);
        System.out.println(b);
    }

    default void printData(){
        print();
    }
}

interface DefineVar2 extends DefineVar{
    int c=30;
    int d=50;

    private void print()
    {
        System.out.println(c);
        System.out.println(d);
    }

    default void printData()
    {
        DefineVar.super.printData();
        print();
    }
}
class PrintVar implements DefineVar , DefineVar2
{
    void callMethod()
    {
        printData();
    }

}


//Check final method overload


class Check {
    final void add()
    {
        System.out.println(10);
    }
    final void add(int i)
    {
        System.out.println(i);
    }
}

//Send multiple arguments

class MultipleArg
{
    void mul(int... a)
    {
        int m = 1;
        for(int b:a)
        {
            m=m*b;
        }
        System.out.println("Multiplication of Number is " + m);
    }

}

//Check the character is vowel or consonant

class CheckChar {
    public CheckChar(char ch)
    {
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
        {
            System.out.println("Vowel");
        }
        else
        {
            System.out.println("Consonant");
        }
    }
}

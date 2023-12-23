package BasicProgram;

public class StaticVarDemo {
    public static void main(String[] args)
    {
        Number n=new Number();
        Number n1=new Number();
        Number n2=new Number();
        Number n3=new Number();
        Number n4=new Number();

        System.out.println("Same Static Variable are allocated for all objects ");

        StaticNumber sn=new StaticNumber();
        StaticNumber sn1=new StaticNumber();
        StaticNumber sn2=new StaticNumber();
        StaticNumber sn3=new StaticNumber();
        StaticNumber sn4=new StaticNumber();
    }
}
class Number{
    int count=0;

    Number()
    {
        count++;
        System.out.println(count);
    }
}

class StaticNumber{
    static int count=0;

    StaticNumber()
    {
        count++;
        System.out.println(count);
    }
}


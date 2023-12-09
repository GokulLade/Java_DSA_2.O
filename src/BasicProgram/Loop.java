package BasicProgram;

public class Loop {
    public static void main(String[] args)
    {
        WhileLoopDemo wd=new WhileLoopDemo();
        wd.whileLoopDemo();

        DoWhileLoopDemo dd=new DoWhileLoopDemo();
        dd.doWhileLoopDemo();

        ForLoopDemo fd=new ForLoopDemo();
        fd.forLoopDemo();

        ForEachLoopDemo fld=new ForEachLoopDemo();
        fld.forEachLoopDemo();

    }
}
class WhileLoopDemo{
    //Print Event number
     void whileLoopDemo()
    {
        System.out.print("While Loop Demo :- ");
        int a=2;
        while(a<=20)
        {
            System.out.print(a +" ");
            a+=2;
        }
    }
}

class DoWhileLoopDemo{
    //Print odd number
    void doWhileLoopDemo()
    {
        System.out.println();
        int b=1;
        System.out.print("Do_While Loop Demo :- ");

        do {
            System.out.print(b+" ");
            b+=2;
        }while (b<=20);

    }
}
class ForLoopDemo{
    //Print Fibonacci series
    void forLoopDemo()
    {
        System.out.println();
        System.out.print("For Loop Demo :- ");
        int userNumber=15;

        int n1=0;
        int n2=1;

        System.out.print(n1);
        System.out.print(" "+n2);
        int sum=0;
        for(int i=1;i<=userNumber;i++)
        {
            sum=n1+n2;
            System.out.print(" "+sum+" ");
            n1=n2;
            n2=sum;
        }


    }
}
class ForEachLoopDemo{
    //Print array Element using foreach loop
    void forEachLoopDemo()
    {
        System.out.println();
        System.out.print("ForEach Loop Demo :- ");
        int a[]={10,20,30,40};

        for (int b:a)
        {

            System.out.print(b+" ");
        }
    }
}

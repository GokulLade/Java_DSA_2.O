package OOPs.Polymorphicm;

import java.util.Scanner;

public class OverridingDemo {
    public static void main(String[] args)
    {
        Tiger t=new Tiger();
        Elephant e=new Elephant();

        Ref r1=new Ref();

        r1.ref(t);
        r1.ref(e);

    }
}
class Ref{
    void ref(Animal r) //Create ref of Animal class Parent class
    {
        r.sleep(); //call the overriding Methods
    }
}

class Animal{
    void sleep()
    {
        System.out.println("Animal are :- ");
    }
}

class Tiger extends Animal{
    @Override
    void sleep()
    {
        System.out.println("Tigers sleep for 8 hours per day.");
    }

}

class Elephant extends Animal{
    @Override
    void sleep()
    {
        System.out.println("Elephant sleep for 8 hours per day.");
    }
}

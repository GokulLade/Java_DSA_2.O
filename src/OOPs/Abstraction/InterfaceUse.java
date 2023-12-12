package OOPs.Abstraction;

public class InterfaceUse {
    public static void main(String[] args)
    {
       Computer lp=new Laptop();    //Create reference of interface and object of Laptop class

       Developer dev=new Developer(); //Create the object of Developer class
       dev.buildApp(lp);
    }
}

class Developer{        //Developer
    void buildApp(Computer obj)
    {
      obj.compileCode();
    }
}
interface Computer{     //interface Define
    void compileCode();
}
class Desktop implements Computer{      //option 1 is Desktop
   public void compileCode()
    {
        System.out.println("Code Compile with 5 Errors...");
    }

}
class Laptop implements Computer{       //option 2 is Laptop
    public void compileCode()
    {
        System.out.println("Code Compile with 1 Errors....");
    }
}

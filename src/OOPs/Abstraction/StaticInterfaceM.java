package OOPs.Abstraction;

public class StaticInterfaceM {
    public static void main(String[] args) {
        Addition.disp();    //Static method calling using interface name without object

    }
}
interface Addition{
    static void disp()  //Define Static method
    {
        System.out.println("Static method in Interface..");
    }
}

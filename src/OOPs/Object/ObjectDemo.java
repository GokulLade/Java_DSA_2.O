package OOPs.Object;

public class ObjectDemo {
    public static void main(String[] args) {
        ObjDemo od=new ObjDemo();//Object Creation using new keyword
        od.disp();  //Method Calling using object

    }
}
class ObjDemo{
    void disp()
    {
        System.out.println("Object is a real world entity.. Without object creation memory are not allocated...");
    }
}

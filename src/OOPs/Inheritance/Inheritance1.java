package OOPs.Inheritance;

public class Inheritance1 {
    public static void main(String[] args) {
        Dog d=new Dog();
        d.show();

    }
}
class Animal{
    void show()
    {
        System.out.println("Dog");
    }
}
class Dog extends Animal{

}

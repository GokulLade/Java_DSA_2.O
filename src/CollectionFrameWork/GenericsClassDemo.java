package CollectionFrameWork;

public class GenericsClassDemo {
    public static void main(String[] args) {

        Name<String> name = new Name<String>("Gokul");

    }
}

class Name<String>{
    public Name(String name)
    {
        System.out.println(name);
    }
}

package BasicProgram;

public class AnnonymousInner {
    public static void main(String[] args) {
        Addition a=new Addition(){  //create a class with in main class without name
            public void add()
            {
                System.out.println("Addition of two number is =" +(10+30));
            }
        };
        a.add(); //method calling

    }
}
interface Addition{
    void add();
}

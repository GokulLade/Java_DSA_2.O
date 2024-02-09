package BasicProgram;

public class CallPrivateContructor {
    public static void main(String[] args)
    {
        Call_Contructor cc=new Call_Contructor();

    }
}
class Call_Contructor{
    private Call_Contructor(int a)
    {
        System.out.println("Private Contructor value ="+a);

    }

    public Call_Contructor()
    {
        this(10);
    }

}

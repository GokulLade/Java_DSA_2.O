package BasicProgram;

public class AccessPrivateMethod extends SecureInfo
{
    public static void main(String[] args)
    {
        AccessPrivateMethod obj = new AccessPrivateMethod();
        obj.accessInfo();

    }
}
class SecureInfo{
    private void info()
    {
        System.out.println("Secure information");
    }

    public void accessInfo()
    {
        info();
    }
}

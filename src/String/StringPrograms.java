package String;

// Main Class
public class StringPrograms {
    public static void main(String[] args)
    {
        StringReverse rv=new StringReverse();
        rv.reverse();

        StringMethod sm=new StringMethod();

    }
}

//String Declaration class
class StringDeclare{
    protected String name="Gokul";
}

//String Reverse program without using string method...
class StringReverse extends StringDeclare{
    void reverse()
    {
        System.out.println();
        System.out.println("****************  Reverse String ****************");

        int len=name.length();

        System.out.print("The original String = ");
        for(int i=0;i<len;i++)
        {
            System.out.print(name.charAt(i)+" ");
        }


        System.out.println();
        System.out.print("The Reverse String = ");
        for(int i=len-1;i>(-1);i--) //i=3
        {
            System.out.print(name.charAt(i)+" ");
        }
    }
}

//Basic String Methods
class StringMethod extends StringDeclare{
    StringMethod()
    {
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("**************** String Methods ****************");
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.concat("Lade"));
        System.out.println(name.length());
        System.out.println(name.trim());
        System.out.println(name.isEmpty());
        System.out.println(name.indexOf('k'));
        System.out.println(name.equals("gokul"));
        System.out.println(name.equalsIgnoreCase("gokul"));
        System.out.println(name.replace("Lade", "patil"));
        System.out.println(name.substring(2));
        System.out.println(name.substring(0,5));
        System.out.println(name);
    }
}

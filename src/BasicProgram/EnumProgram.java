package BasicProgram;

public class EnumProgram {
    public static void main(String[] args)
    {
        StudentResult res= StudentResult.PASS;
        res.setMark(76);
        int r=res.getMark();
        System.out.println(r);

        StudentResult res1= StudentResult.NR;
        int r1=res1.getMark();
        System.out.println(r1);

        StudentResult res2= StudentResult.FAIL;
        res2.setMark(34);
        int r2=res2.getMark();
        System.out.println(r2);

        //You can also define the enum in the class
        enum Color{
            RED,GREEN,BLUE;
        }
        Color c=Color.GREEN;
        System.out.println(c);

        Color c1=Color.RED;
        System.out.println(c1);

        Color c2=Color.BLUE;
        System.out.println(c2);
    }
}

enum StudentResult{
    PASS,FAIL,NR;

    int mark;
    StudentResult()//Contractor method called three times because const are defined three
    {
        System.out.println("Contractor in enum..");
    }

    void setMark(int mark)
    {
        this.mark=mark;

    }

    int getMark()
    {
        return mark;
    }
}

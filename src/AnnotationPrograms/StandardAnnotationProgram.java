package AnnotationPrograms;

public class StandardAnnotationProgram {
    public static void main(String[] args)
    {
        Teacher s=new Student();
        s.rules();

        Addition ad=(a,b)-> System.out.println("Addition of two number is " +(a+b));
        ad.add(10,20);

    }
}

@FunctionalInterface// StandardAnnotation(In-Build Annotation)
interface  Addition{
    void add(int a,int b);
    //void mul(); Can not add multiple abtracts methods

}

class Teacher
{
    public void rules()
    {
        System.out.println("Teacher rules..");
    }
}
class Student extends Teacher{
   @Override    // StandardAnnotation(In-Build Annotation)
   public void rules()
   {
        System.out.println("Student rules..");
   }
}

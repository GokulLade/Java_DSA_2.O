package AnnotationPrograms;

import java.lang.annotation.*;

public class CustomAnnotationProgram {
    public static void main(String[] args)
    {
        Employee e = new Employee();
        e.setId(190,"Gokul");
        System.out.println(e.getName());
        System.out.println(e.getId());

        //Retrieve the data from Annotation by using the Reflection API

        Class c= e.getClass();
        Annotation a= c.getAnnotation(ITCompany.class);
        ITCompany cp=(ITCompany)a;

        System.out.println("Company Name : "+cp.companyName());

    }
}
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface ITCompany{
     String companyName() default "Accenture";
}
@ITCompany()
class Employee{
    int id;
    String name;

    void setId(int id,String name)
    {
        this.id=id;
        this.name=name;
    }
   String getName()
   {
       return name;
   }
    int getId()
    {
        return id;
    }
}
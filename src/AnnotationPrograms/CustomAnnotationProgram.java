package AnnotationPrograms;

import java.lang.annotation.*;

public class CustomAnnotationProgram {
    public static void main(String[] args)
    {
        Employee e = new Employee();
        e.setId();
        System.out.println(e.getName());
        System.out.println(e.getId());

        //Retrieve the data from Annotation by using the Reflection API

        Class<? extends Employee> c= e.getClass();
        ITCompany cp= c.getAnnotation(ITCompany.class);

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

    void setId()
    {
        this.id= 190;
        this.name= "Gokul";
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
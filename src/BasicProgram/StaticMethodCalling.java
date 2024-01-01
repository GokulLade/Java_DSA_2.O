package BasicProgram;

import java.util.Scanner;

public class StaticMethodCalling
{
    public static void main(String[] args)
    {
        int num1;
        int num2;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Number");
        num1 = sc.nextInt();

        System.out.println("Enter Second Number ");
        num2= sc.nextInt();

        StaticDemo.StaticVar.setValue(num1,num2);


    }
}

class StaticDemo{
    static class StaticVar
    {
        private static int n1=20;
        private static int n2=30;

        public static void setValue(int num1,int num2) {

            n1 = num1;
            n2=num2;

            System.out.println("The Multiplication of two number is = "+StaticDemo.StaticVar.getValue()); //method calling

        }

        public static int getValue()
        {
            return n1*n2;
        }

    }

}


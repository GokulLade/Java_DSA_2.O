package BasicProgram;

public class LambdaExpression {
    public static void main(String[] args)
    {
        //Define Lambda Expression
        Multiplication m= (a,b)->{ System.out.println("The Multiplication of two number is  = "+(a*b));};
        m.mul(20,30);
    }
}
@FunctionalInterface
interface Multiplication{
    void mul(int a, int b);
}

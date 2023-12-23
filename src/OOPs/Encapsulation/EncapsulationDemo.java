package OOPs.Encapsulation;

import java.util.Scanner;

public class EncapsulationDemo {
    public static void main(String[] args) {
        CheckBalance ck=new CheckBalance();
        ck.checkBalance();


    }
}

//Class is the best Example of Encapsulation
class CheckBalance{

    private double accountBalance=20384;

    Scanner sc=new Scanner(System.in);

    double AccountNumber=0;

    public void checkBalance()
    {
        System.out.println("Enter Your account number..");
        AccountNumber=sc.nextDouble();

        if(AccountNumber==2003)
        {
            System.out.println("Your Account Balance is = "+accountBalance);
        }
        else
        {
            System.out.println("Please Enter valid Account Number..");
        }

    }

}

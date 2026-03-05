package Assignment75;

import java.util.*;

class Assignment75_2 
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter age : ");
        int Age = sobj.nextInt();

        System.out.println("Enter monthly income : ");
        int Monthly_Income = sobj.nextInt();

        System.out.println("Enter Credit score : ");
        int credit_Score = sobj.nextInt();

        System.out.println("Enter existing unpid loan  : (Yes/No)");
        String ExistingUnpaidLoan = sobj.next();

        if(Age < 0 || Monthly_Income < 0 ||credit_Score < 0 )
        {
            System.out.println("Invalid Input");
            return;
        }

        if((ExistingUnpaidLoan.equalsIgnoreCase("Yes") == false) && (ExistingUnpaidLoan.equalsIgnoreCase("No")==false))
        {
            System.out.println("Invalid input");
            return;
        }

        if(Age < 21 || Age > 60)
        {
            System.out.println("Loan rejected : Age is not valid");
            return;
        }

        else if(Monthly_Income < 25000)
        {
            System.out.println("Loan rejected : Monthly income is not valid");
            return;
        }

        else if(credit_Score < 700)
        {
            System.out.println("Loan rejected : credit score is not valid");
            return;
        }
        else if(ExistingUnpaidLoan.equalsIgnoreCase("Yes"))
        {
            System.out.println("Loan rejected : Because existing loan is unpaid");
            return;
        }
        else
        {
            System.out.println("Loan approved");
        }

    }
}

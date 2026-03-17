package Assignment77;

import java.util.*;

public class Assignment77_1 
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Days = 0;
        int MedicineBill = 0;
        int ConsultationFee = 0 ;
        int TotalBill = 0;
          
        String WardType = null;
        String IsInsurance = null;

        System.out.println("Enter number of days : ");
        Days = sobj.nextInt();

        System.out.println("Enter ward type : (Normal / ICU) ");
        WardType = sobj.next();

        System.out.println("Enter medicine bill : ");
        MedicineBill = sobj.nextInt();

        System.out.println("Enter consultation fees : ");
        ConsultationFee = sobj.nextInt();

        System.out.println("Is insurance or not : (Yes/No)");
        IsInsurance = sobj.next();

        if( Days < 0 || MedicineBill < 0 ||  ConsultationFee < 0)
        {
            System.out.println("Invalid input");
            return;
        }

        if(WardType.equalsIgnoreCase("Normal") == false  &&
           WardType.equalsIgnoreCase("ICU") == false)
        {
            System.out.println("Invalid input");
            return;
        }

        if(IsInsurance.equalsIgnoreCase("Yes") == false  &&
           IsInsurance.equalsIgnoreCase("No") == false)
        {
            System.out.println("Invalid input");
            return;
        }

        if(IsInsurance.equalsIgnoreCase("Yes"))
        {
            
        }



    }    
}

package Assignment78;

import java.util.*;

public class Assignment78_1 
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int TotalDays = 0;
        float TotalBill = 0;
        float DiscountAmount = 0.0f;

        System.out.println("Enter number of days stays : ");
        TotalDays = sobj.nextInt();

        if(TotalDays < 0)
        {
            System.out.println("Invalid input");
            return;
        }

        if(TotalDays > 0 && TotalDays <=7)
        {
            TotalBill = 3000 * TotalDays;
        }

        else if(TotalDays > 7)
        {

            TotalBill = ((7 * 3000) + (((TotalDays - 7) * 3000)));
            DiscountAmount = TotalBill * 0.05f;
            TotalBill = TotalBill - DiscountAmount;
        }

        System.out.println("Total Stays Duration : "+TotalDays);
        System.out.println("Final Bill Amount : "+TotalBill);

    }
}

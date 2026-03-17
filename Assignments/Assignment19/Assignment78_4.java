package Assignment78;

import java.util.*;

public class Assignment78_4
{
    public static void main(String A[])  
    {
        Scanner sobj = new Scanner(System.in);

        int CallDurationMin = 0;
        int TotalCharge = 0;

        System.out.println("Enter call duration is minutes : ");
        CallDurationMin = sobj.nextInt();

        if(CallDurationMin < 0)
        {
            System.out.println("Invalid input");
            return;
        }

        if(CallDurationMin <= 5)
        {
            TotalCharge = 0;
        }
        else if(CallDurationMin > 5 && CallDurationMin <= 15)
        {
            TotalCharge = (CallDurationMin - 5) * 1;
        }
        else if(CallDurationMin > 15)
        {
            TotalCharge = 10 + ((CallDurationMin - 15) * 2);
        }

        System.out.println("Call duration : <minutes> "+CallDurationMin);
        System.out.println("Total Call Charges : "+TotalCharge);
    } 
}

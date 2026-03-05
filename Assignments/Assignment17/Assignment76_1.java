package Assignment76;

import java.util.*;

public class Assignment76_1 
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Distance = 0;
        float TotalFare = 0.0f;
        int BaseFare = 50;

        String PeakHour = null;

        System.out.println("Enter distance : ");
        Distance = sobj.nextInt();

        System.out.println("Peak hour : (Yes/No)");
        PeakHour = sobj.next();

        if(Distance < 0)
        {
            System.out.println("Distance can not be negative");
            return;
        }

        if(Distance <=10)
        {
            TotalFare = (Distance * 12) + BaseFare;
        } 
        else if(Distance >10)
        {
            TotalFare = (10 * 12) + ((Distance - 10 ) * 15) + BaseFare;
        }

        if(PeakHour.equalsIgnoreCase("Yes"))
        {
            TotalFare = (TotalFare + (TotalFare * 0.20f)); 
        }

        System.out.println("Distance :"+Distance+ "km");
        System.out.println("Peak Hour : <Yes/No>"+PeakHour);
        System.out.println("Total fare : "+TotalFare);
    }    
}

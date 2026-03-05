package Assignment76;

import java.util.*;

public class Assignment76_5 
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int BatteryPercent = 0;

        System.out.println("Enter battery percentage : ");
        BatteryPercent = sobj.nextInt();

        if(BatteryPercent < 0 || BatteryPercent > 100)
        {
            System.out.println("Invalid input");
            return;
        }

        System.out.println("Battery Percentage : "+BatteryPercent);
        
        if(BatteryPercent <= 5)
        {
            System.out.println("Status : Critical");
        }
        else if(BatteryPercent <= 15)
        {
            System.out.println("Status : Low");
        }
        else
        {
            System.out.println("Status : Normal");
        }

    }    
}

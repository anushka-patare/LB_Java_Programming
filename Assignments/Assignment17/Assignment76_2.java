package Assignment76;

import java.util.*;

public class Assignment76_2 
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int MarksPercent = 0;
        int AttendancePercent = 0;
        int Income = 0;

        System.out.println("Enter Marks : ");
        MarksPercent = sobj.nextInt();

        System.out.println("Enter Attendance : ");
        AttendancePercent = sobj.nextInt();

        System.out.println("Enter Family income : ");
        Income = sobj.nextInt();

        if(MarksPercent < 0 || MarksPercent > 100 || AttendancePercent < 0 || AttendancePercent > 100)
        {
            System.out.println("Invalid input");
            return;
        }

        if(Income < 0)
        {
            System.out.println("Invalid input");
            return;
        }

        if(MarksPercent >= 80 &&  AttendancePercent >= 75 && Income  <= 300000)
        {
            System.out.println("Scholarship approved");
        }
        else
        {
            System.out.println("Scholarship rejected : Your not fit in conditions ");
        }

    }    
}

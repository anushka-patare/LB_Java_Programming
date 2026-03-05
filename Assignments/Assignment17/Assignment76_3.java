package Assignment76;

import java.util.*;

public class Assignment76_3 
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int Weight = 0;
        int Charge = 0;

        System.out.println("Enter Parcel weight : ");
        Weight = sobj.nextInt();

        if(Weight < 0)
        {
            System.out.println("Invalid input");
            return;
        }

        if(Weight  <=1)
        {
            Charge = 50;
        }
        else if(Weight <= 5)
        {
            Charge = 50 + ((Weight-1) * 20);
        }
        else if(Weight>5)
        {
            Charge = 150 + ((Weight - 5)*30);
        }

        System.out.println("Parcel weight : "+Weight+" kg");
        System.out.println("Courier charge : "+Charge);
    }    
}

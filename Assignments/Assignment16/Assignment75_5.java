package Assignment75;

import java.util.*;

public class Assignment75_5 
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter annual income : ");
        int Income = sobj.nextInt();

        float tax = 0.0f;

        if(Income < 0)
        {
            System.out.println("Income can not be negative");
            return;
        }

        if(Income <= 250000)
        {
            tax = Income * (0.0f);
        }

        else if(Income>250000 && Income <=500000)
        {
            tax = (Income - 250000 ) * 0.05f;
        }
        else if(Income > 500000 && Income <=1000000)
        {
            tax = (250000 * 0.0f) + (250000 * 0.05f) + ((Income - 500000) * 0.20f) ;
        }
         
        else 
        {
            tax =  (250000 * 0.0f) + (250000 * 0.05f) + (500000 * 0.20f) + ((Income - 1000000) * 0.30f);
        }

        System.out.println("Annual income : "+Income);
        System.out.println("Tax payable : "+tax);

        }
    }


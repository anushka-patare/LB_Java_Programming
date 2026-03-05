package Assignment76;

import java.util.*;

public class Assignment76_4 
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Budget = 0;
        int Count = 0;
        int N = 0;
        int i =0;

        System.out.println("Enter Budget : ");
        Budget = sobj.nextInt();

        System.out.println("Enter number of items : ");
        N = sobj.nextInt();

        int itemPrice[] = new int[N];

        if(Budget <=0 || N <=0)
        {
            System.out.println("Invalid input");
            return;
        }

        System.out.println("Enter item price : ");

        for(i=0; i < itemPrice.length; i++)
        {
            itemPrice[i] = sobj.nextInt();

            if(itemPrice[i] <=0)
            {
                System.out.println("Invalid input");
                return;
            }
        }

        for(i=0; i<itemPrice.length; i++)
        {
            if(Budget >= itemPrice[i])
            {
                Budget = Budget - itemPrice[i];
                Count++;
            }
            else 
            {
                break;
            }
        }

        System.out.println("Items purchased : "+Count);
        System.out.println("Remaining Balance : "+Budget);

    }
}

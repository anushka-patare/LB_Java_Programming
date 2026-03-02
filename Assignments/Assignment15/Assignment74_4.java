import java.util.*;

class program799
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Units = 0;
        int Amount = 0;

        System.out.println("Enter units consumed :");
        Units = sobj.nextInt();

        if(Units < 0)
        {
            System.out.println("Units can not be negative");
            return;
        }

        if(Units <= 100 )
        {
            Amount = Units * 5;
        }

        else if(Units <= 200)
        {
            Amount = (5 * 100) + ((Units - 100) * 7);
        }

        else
        {
            Amount = (5 * 100) + (100 * 7) + ((Units - 200) * 10);
        }    

        System.out.println("Units consumed : "+Units);
        System.out.println("Electricity Bills : "+Amount);
       
        sobj.close();
    }
}
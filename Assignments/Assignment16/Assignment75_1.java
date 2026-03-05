package Assignment75;
import java.util.*;

class Assignment75_1 
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Total parking hours :");
        int Hours = sobj.nextInt();

        int Amount = 0;

        if(Hours < 0)
        {
            System.out.println("Hours can not be negative");
            return;
        }

        if(Hours <= 2)
        {
            Amount = 20;
            
        }
        else if(Hours > 2 )
        {
            Amount = 20 + ((Hours - 2) * 10);
        }
        
        if(Hours > 10 )
        {   
            Amount = 20 + ((Hours - 2)  *  10) + 50 ;
        }
        System.out.println("Total parking duration : "+Hours+"Hours");

        System.out.println("Total parking fees : "+Amount);

    }
}

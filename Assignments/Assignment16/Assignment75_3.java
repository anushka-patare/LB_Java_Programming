package Assignment75;

import java.util.*;

class Assignment75_3 
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter current stock : ");
        int CurrentStock = sobj.nextInt();

        System.out.println("Enter requested quantity: ");
        int RequestedQuantity = sobj.nextInt();


        if(CurrentStock < 0)
        {
            System.out.println("Stocks can not be negative");
            return;
        }

        if(RequestedQuantity < 0)
        {
            System.out.println("requested quantity must be greater than 0");
            return;
        }

        if(RequestedQuantity > CurrentStock)
        {
            System.out.println("Order failed : insufficient stock");   
        }

        else 
        {
            CurrentStock = CurrentStock - RequestedQuantity;
            System.out.println("Order Processed successfully");
            System.out.println("Remaining stock : "+CurrentStock);
            
        }
        
        if(CurrentStock < 5)
        {
            System.out.println("Low stock alert");
        }

    }    
}

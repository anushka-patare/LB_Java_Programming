package Assignment75;

import java.util.*;

class Assignment75_4 
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Fine  =0;
        System.out.println("Helmet worn : (Yes/ No)");
        String helmet = sobj.next();

        System.out.println("License available: (Yes/ No)");
        String license = sobj.next();

        System.out.println("Overspeeding : (Yes/ No)");
        String overspeeding = sobj.next();

        if((helmet.equalsIgnoreCase("yes")==false) && (helmet.equalsIgnoreCase("No")==false) ||

           ((license.equalsIgnoreCase("yes")==false) && ((license.equalsIgnoreCase("No")==false))) ||

           ((overspeeding.equalsIgnoreCase("yes")==false) && (overspeeding.equalsIgnoreCase("No")==false )))
        {
            System.out.println("Invalid input");
            return;
        }
        
        if(helmet.equalsIgnoreCase("No"))
        {
            Fine = Fine + 500;
        }

        if(license.equalsIgnoreCase("No"))
        {
            Fine =  Fine + 1000;
        }
        
        if(overspeeding.equalsIgnoreCase("Yes"))
        {
            Fine = Fine + 1500;
        }
        

        System.out.println("Total Amount : "+Fine);
    }    
}

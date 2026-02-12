import java.util.*;
import java.io.*;

class Assignment56_4 
{
   public static void main(String A[]) throws Exception
   {
        Scanner sobj = new Scanner(System.in);

        String FileName = null;

        System.out.println("Enter name of file:");
        FileName = sobj.nextLine();

        File fobj = new File(FileName);

        if(fobj.exists())
        {
            System.out.println("File is exists");
        }
        else
        {
            fobj.createNewFile();
            System.out.println("File gets created successfully");
        }

   }    
}

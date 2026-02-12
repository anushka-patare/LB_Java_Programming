import java.util.*;
import java.io.*;

class Assignment57_3 
{
    public static void main(String A[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter name of directory that you want to create :");
        String DirName = sobj.nextLine();

        boolean bRet = false;

        File fDir = new File(DirName);

        bRet = fDir.mkdirs();

        if(bRet == true)
        {
             System.out.println("Directory gets created successfully");
        }
        else
        {
            System.out.println("Directory was not created");
        }
        

    }
}

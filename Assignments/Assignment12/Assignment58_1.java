package Assignment58;

import java.util.*;
import java.io.*;

public class Assignment58_1 
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int i = 0;

        System.out.println("Enter name of directory:");
        String DirName = sobj.nextLine();

        File fobj = new File(DirName);

        if(fobj.exists() && fobj.isDirectory())
        {
            File fArr[] = fobj.listFiles();

            for(i=0; i<fArr.length; i++)
            {
                if(fArr[i].isFile())
                {
                    System.out.println("File name :"+fArr[i]);
                }
            }
        }
        else
        {
            System.out.println("Directory was not present");
        }
    }   
}

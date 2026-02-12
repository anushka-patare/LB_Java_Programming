package Assignment58;

import java.util.*;
import java.io.*;

public class Assignment58_2 
{
    public static void main(String A[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);
        
        String DirName = null;

        String FileName  = null;

        String Header = null;

        int i = 0, j = 0;

        byte bHeader[] = new byte[1024];

        System.out.println("Enter name of directory :");
        DirName = sobj.nextLine();

        System.out.println("Enter name of another file :");
        FileName = sobj.nextLine();

        File fobj1 = new File(DirName); 

        if(fobj1.exists() && fobj1.isDirectory())
        {
            File PackObj = new File(FileName);
            
            PackObj.createNewFile();

            FileInputStream fiobj = null;

            FileOutputStream foobj = new FileOutputStream(PackObj);

            System.out.println("Folder is present");

            File fArr[] = fobj1.listFiles();

             for(i = 0; i<fArr.length; i++)
            {
                fiobj = new FileInputStream(fArr[i]);
            
                Header = fArr[i].getName() + " ";

                for(j = Header.length(); j<100; j++)
                {
                    Header = Header + " ";
                }

                bHeader = Header.getBytes();
                
                foobj.write(bHeader,0,100);
                    
                }
             }
    }    
}

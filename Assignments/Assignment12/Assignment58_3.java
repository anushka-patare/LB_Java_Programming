package Assignment58;

import java.util.*;
import java.io.*;

class Assignment58_3 
{
    public static void main(String A[]) throws Exception
    {
        String DirName = null;
        String FileName = null;

        FileInputStream fiobj = null;
        FileOutputStream foobj = null;

        File fobj = null;

        int iRet = 0;

        byte Buffer[] = new byte[100];

        int i = 0, j = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter name of directory :");
        DirName = sobj.nextLine();

        System.out.println("Enter name of another file :");
        FileName = sobj.nextLine();

        fobj = new File(DirName);

        if(fobj.exists() && fobj.isDirectory())
        {
            File packObj = new File(FileName);
            packObj.createNewFile();

            foobj = new FileOutputStream(packObj);

            File fArr[] = fobj.listFiles();

            for(i=0; i<fArr.length;i++)
            {
                fiobj = new FileInputStream(fArr[i]);

                while((iRet = fiobj.read(Buffer)) != -1)
                {
        
                    foobj.write(Buffer,0,iRet);

                }

            }

        }

        
    }
}

import java.util.*;
import java.io.*;

class Assignment56_2
{
    public static void main(String A[]) throws Exception
    {
        byte Buffer[] = new byte[100];
        int iRet = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter name of file :");
        String FileName = sobj.nextLine();

        File fobj = new File(FileName);

        if(fobj.exists())
        {
            String str = null;

            FileInputStream fiobj = new FileInputStream(fobj);

            while((iRet = fiobj.read(Buffer)) != -1)
            {
                str = new String(Buffer,0,iRet);
                System.out.println(str);
                str = null;
            }
            System.out.println();


        }
         else
        {
            System.out.println("There is no such file");
        }
 
        sobj.close();

    }
}
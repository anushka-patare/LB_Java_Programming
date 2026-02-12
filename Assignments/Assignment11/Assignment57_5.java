
import java.util.*;
import java.io.*;

class Assignment56_5 
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        String DirName = null;

        int i = 0;

        System.out.println("Enter name of directory:");
        DirName = sobj.nextLine();

        File fobj = new File(DirName);

        if(fobj.exists() && fobj.isDirectory())
        {
            System.out.println("Folder is present");

            File fArr[] = fobj.listFiles();

            for(i=0; i<fArr.length; i++)
            {
                System.out.println("File name :"+fArr[i]+ "  File Size :"+fArr[i].length());
            }
        }
        else
        {
            System.out.println("Directory is not present");
        }

        sobj.close();
        
    }    
}

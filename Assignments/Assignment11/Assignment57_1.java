import java.util.*;
import java.io.*;
class Assignment57_1 
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        
        String FileNameSrc = null;
        String FileNameDest = null;

        File fSrcObj = null;
        File fDestObj = null;

        FileInputStream fiobj = null;
        FileOutputStream foobj = null;

        byte Buffer [] = new byte[1024];

        int iRet = 0;

        System.out.println("Enter name of source file:");
        FileNameSrc = sobj.nextLine();

        fSrcObj = new File(FileNameSrc);

        System.out.println("Enter name of destination file :");
        FileNameDest = sobj.nextLine();

        if(fSrcObj.exists())
        {
            fDestObj = new File(FileNameDest);

            fDestObj.createNewFile();

            fiobj = new FileInputStream(fSrcObj);

            foobj = new FileOutputStream(fDestObj);

            while((iRet = fiobj.read(Buffer)) != -1)
            {
                foobj.write(Buffer,0,iRet);

            }

            System.out.println("File copied successfully");
            fiobj.close();
            foobj.close();

        }

    }
}

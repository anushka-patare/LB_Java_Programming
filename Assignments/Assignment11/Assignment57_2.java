
import java.util.*;
import java.io.*;

class Assignment57_2 
{
    public static void main(String A[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        String Filename = null;

        System.out.println("Enter name of file :");
        Filename = sobj.nextLine();

        File fobj = new File(Filename);

        if(fobj.exists() && fobj.isFile())
        {
            System.out.println("File is regular file");
        }
        else
        {
            System.out.println("File is not regular");
        }
    }
}

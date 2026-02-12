import java.util.*;
import java.io.*;

public class Assignment56_3
{
    public static void main(String A[]) throws Exception
    {
        Scanner sobj = null;
        sobj = new Scanner(System.in);
        FileOutputStream foobj = null;
        File fobj = null;

        String FileName = null;
        String Data = null;

        byte Arr[] = null;

        System.out.println("Enter name of file:");
        FileName = sobj.nextLine();

        System.out.println("Enter data for writing into file:");
        Data = sobj.nextLine();

        fobj = new File(FileName);

        if(fobj.exists())
        {

            foobj = new FileOutputStream(fobj,true);
            Arr = Data.getBytes();
            foobj.write(Arr);

            System.out.println("Data successfully written into file");

        }
        else 
        {
            System.out.println("There is nosuch file");
        }


    }
}

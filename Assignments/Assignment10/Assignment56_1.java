import java.util.Scanner;
import java.io.File;

class Assignment56_1
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter file name :");
        String FileName = sobj.nextLine();

        File fobj = new File(FileName);

        if(fobj.exists())
        {
            System.out.println("File gets successfully opened");
        }
        else
        {
            System.out.println("File not exists");
        }
    }
}
import java.util.*;

class RecursionX
{
    
    public void Display(int iNo)
    {
        if(iNo>=1)
        {
            System.out.print(iNo+"\t*\t");
            iNo--;
            Display(iNo);
        }
    }
}
class Assignment41_1 
{
    public static void main(String A[])
    {
        Scanner scanobj = new Scanner(System.in);

        System.out.println("Enter number :");
        int no = scanobj.nextInt();

        RecursionX robj = new RecursionX();
        robj.Display(no);
    }
}

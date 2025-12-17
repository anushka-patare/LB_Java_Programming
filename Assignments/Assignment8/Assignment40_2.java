
import java.util.*;
class RecursionX
{
    int iCnt = 1;
    public void Display(int iNo)
    {
       
        if(iCnt <= iNo)
        {
            System.out.print(iCnt+"\t");
            iCnt++;
            Display(iNo);
        }
      

    }
}
class Assignment40_2
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number:");
        int no = sobj.nextInt();

        RecursionX robj = new RecursionX();
        robj.Display(no);
    }
}

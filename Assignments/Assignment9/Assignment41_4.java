import java.util.*;

class RecursionX
{ 
    int iFact = 1;
    public int Fact(int iNo)
    {
        if(iNo>=1)
        {
            iFact = iFact * iNo;
            iNo--;
            Fact(iNo);
        }
        return iFact;
}
    }
   
class Assignment41_4 
{
    public static void main(String A[])
    {
        int iValue = 0 ,iRet = 0;
        System.out.println("Enter number :");
        Scanner sobj = new Scanner(System.in);

        iValue = sobj.nextInt();

        RecursionX robj = new RecursionX();
        iRet = robj.Fact(iValue);
          
        System.out.println(iRet);
    }
}

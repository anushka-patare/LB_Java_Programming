import java.util.*;

class RecursionX
{
    int iDigit = 0,iMult = 1;
    public int Mult(int iNo)
    {
        if(iNo>0)
        {
            iDigit = iNo % 10;
            iNo = iNo / 10; 
            iMult = iMult * iDigit;

            Mult(iNo);
        }
        return iMult;
    }
    
}
class Assignment41_5
{
    public static void main(String A[])
    {
        int iValue = 0 ,iRet = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number");
        iValue = sobj.nextInt();

        RecursionX robj =new RecursionX();
        iRet = robj.Mult(iValue);
        
        System.out.println(iRet);

    }
}

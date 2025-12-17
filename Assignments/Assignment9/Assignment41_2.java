import java.util.*;

class RecursionX
{
    int iDigit = 0,iSum = 0;
    public int Sum(int iNo)
    {
        if(iNo>0)
        {
            iDigit = iNo % 10;
            iNo = iNo / 10; 
            iSum= iSum + iDigit;

            Sum(iNo);
        }
        return iSum;
    }
    
}
class Assignment41_2
{
    public static void main(String A[])
    {
        int iValue = 0 ,iRet = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number");
        iValue = sobj.nextInt();

        RecursionX robj =new RecursionX();
        iRet = robj.Sum(iValue);
        
        System.out.println("Summation is :"+iRet);

    }
}

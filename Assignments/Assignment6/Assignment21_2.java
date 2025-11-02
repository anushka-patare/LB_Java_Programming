class Logic
{
    void countEvenOddRange(int n)
    {
        int iCount1=0,iCount2=0;
        int iCnt = 0;

        for(iCnt = 1;iCnt<=n;iCnt++)
        {
            if(iCnt%2==0)
            {
                iCount1 = iCount1 + 1;
            
            }
            else
            {
                iCount2= iCount2 + 1;
            }
        }
        System.out.println("Even numbers between 1 and N is:"+iCount1);
        System.out.println("Odd numbers between 1 and N is:"+iCount2);
    }
}
class Assignment21_2 
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.countEvenOddRange(50);
    }
}

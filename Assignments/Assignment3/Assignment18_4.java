class Logic
{
    void sumEvenOddDigits(int num)
    {
        int iDigit = 0,iSum1=0,iSum2=0;

        if(num < 0)
        {
            num = -num;
        }
        while(num != 0)         
        {
            iDigit = num % 10;
            num = num / 10;

            if(iDigit % 2== 0)
            {
                iSum1 = iSum1 + iDigit; 
            }
            if(iDigit % 2 !=0)
            {
                iSum2 = iSum2 + iDigit;
                
            }
        }
        System.out.println(iSum1);
        System.out.println(iSum2);
    }
}

class Assignment18_4 
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.sumEvenOddDigits(123456);
    }
}

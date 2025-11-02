class Logic
{
    void countDigits(int num)
    {
        int iDigit = 0,iCount=0;

        if(num < 0)
        {
            num = -num;
        }
        while(num != 0)         
        {
            iDigit = num % 10;
            num = num / 10;
            
            iCount = iCount + 1;
        
        }
        System.out.println(iCount);
    }
}

class Assignment16_5
{
    public static void main(String args[]) 
    {
        Logic obj = new Logic();
        obj.countDigits(7865);

    }    
}

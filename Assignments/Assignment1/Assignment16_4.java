class Logic
{
    void reverseNumber(int num)
    {
         int iDigit = 0;

        if(num < 0)
        {
            num = -num;
        }
        while(num != 0)         
        {
            iDigit = num % 10;
            System.out.println(iDigit);
            num = num / 10;
        }

    }
}

class Assignment16_4
{
    public static void main(String args[]) 
    {
        Logic obj = new Logic();
        obj.reverseNumber(1234);

    }    
}

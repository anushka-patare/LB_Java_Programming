class Logic
{
    void productOfDigits(int num)
    {
        int iDigit = 0,iMult=1;
        if(num < 0)
        {
            num = -num;
        }
        while(num != 0)         
        {
            iDigit = num % 10;
            num = num / 10;

            iMult = iMult  * iDigit;
        }
      System.out.println("Product of digits is:"+iMult);
    }
    
    }
class Assignment21_1 
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.productOfDigits(234);
    }
    
}

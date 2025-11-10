class Logic
{
    void findSmallestDigit(int num)
    {
        int iDigit = 0, iSmallestNum=8;
        if(num < 0)
        {
            num = -num;
        }
        while(num != 0)         
        {
            iDigit = num % 10;
            num = num / 10;

            if(iDigit < iSmallestNum)
            {
                iSmallestNum = iDigit;
            }
              
        }
         System.out.println("Smallest digit is:"+iSmallestNum);
    }
}
class Assignment20_5 
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.findSmallestDigit(45872);
    }
}
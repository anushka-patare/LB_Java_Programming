class Logic
{
    void findLargestDigit(int num)
    {
        int iDigit = 0, iLargestNum=0;
        if(num < 0)
        {
            num = -num;
        }
        while(num != 0)         
        {
            iDigit = num % 10;
            num = num / 10;

            if(iDigit > iLargestNum)
            {
                iLargestNum = iDigit;
               
            }
              
        }
         System.out.println("Largest digit is:"+iLargestNum);
    }
}
class Assignment20_4 
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.findLargestDigit(83429);
    }
}

class Logic
{
    void findFactorial(int num)
    {
         int iFact = 1;
         int iCnt= 0;

         for(iCnt = num; iCnt>=1;iCnt--)
         {
            iFact=iFact*iCnt;
         }
         System.out.println("Factorial of number is:"+iFact);
    }
}
class Assignment16_3 
{
     public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.findFactorial(5);
    }
}

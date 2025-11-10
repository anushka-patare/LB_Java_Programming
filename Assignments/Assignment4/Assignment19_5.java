class Logic
{
    void calculatePower(int base , int exp)
    {
        int iCnt = 0;
        int iRet = 1;
        for(iCnt=1;iCnt<=exp;iCnt++)
        {
            iRet = iRet *base ;
        }
        System.out.println("Power of a number is "+iRet);
    }
}
class Assignment19_5 
{
     public static void main(String args[])
     {
        Logic obj = new Logic();
        obj.calculatePower(2,5);
     }    
}

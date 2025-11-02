
class Logic
{
    void calculateSum(int n)
    {
         int iCnt=0,iSum=0;
         for(iCnt = 1; iCnt<=n; iCnt++)
         {

            iSum = iSum + iCnt;
           
         }
         System.out.println("Addition of first N natural numbers is :"+iSum);

    }
}

class Assignment16_1
{
    public static void main(String A[])
    {
    
        Logic obj = new Logic();
        obj.calculateSum(10);
    }
}
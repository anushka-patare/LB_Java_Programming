class Logic
{
    void printTable(int  num)
    {
        int iCnt = 0,iMult=0;
        for(iCnt = 1; iCnt<= 10;iCnt++)
        {
              iMult = iCnt * num;
              System.out.println(iMult);
        }
    }
}
class Assignment17_5
{
      public static void main(String args[])
      {
        Logic obj = new Logic();
        obj.printTable(5);
      }    
}

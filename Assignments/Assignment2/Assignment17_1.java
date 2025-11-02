class Logic
{
      void sumOfDigits(int num)
      {

        int iDigit = 0,iSum=0;

        if(num < 0)
        {
            num = -num;
        }
        while(num != 0)         
        {
            iDigit = num % 10;
            num = num / 10;
            
            iSum = iSum + iDigit;
        
        }
        System.out.println("Sum of digits of number is:"+iSum);
      }

}

public class Assignment17_1 
{
    public static void main(String args[])
        {
             Logic obj = new Logic();
             obj.sumOfDigits(1234);
        } 
}

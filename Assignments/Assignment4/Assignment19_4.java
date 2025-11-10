class Logic
{
    void printDigits(int num)
    {
        while(num !=0)
        {
        int iDigit = 0;
        iDigit = num % 10;
        System.out.println(iDigit);
        num = num / 10;
        }
        
    }
}
class Assignment19_4 
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.printDigits(9876); 
    }
}

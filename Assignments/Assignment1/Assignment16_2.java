class Logic
{
    void checkEvenOdd(int num)
    {
        if(num%2==0)
        {
            System.out.println("Numner is even");
        }
        else
        {
            System.out.println("Number is odd");
        }
    }
}
class Assignment16_2
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.checkEvenOdd(7);
    }
}

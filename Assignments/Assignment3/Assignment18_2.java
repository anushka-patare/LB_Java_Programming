class Logic
{
    void printEvenNumbers(int n)
    {
        int iCnt = 0;
        for(iCnt = 1;iCnt<=n; iCnt++)
        {
            if(iCnt%2==0)
            {
                System.out.println("Even numbers:"+iCnt);
            }
        }
    }
}

class Assignment18_2
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.printEvenNumbers(20);
    }
}

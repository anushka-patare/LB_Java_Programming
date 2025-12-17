class RecursionX
{
    int iCnt = 1;
    public void Display()
    {
        if(iCnt<=5)
        {
            System.out.print("*\t");
            iCnt++;
            Display();
        }
    }
}

class Assignment39_1 
{
    public static void main(String A[])
    {
        RecursionX robj = new RecursionX();
        robj.Display();
    }
}

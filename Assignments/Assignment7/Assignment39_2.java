class RecursionX
{
    int iCnt = 1;
    public void Display()
    {
        if(iCnt<=5)
        {
            System.out.print(iCnt+"\t");
            iCnt++;
            Display();
        }
    }
}

class Assignment39_2
{
    public static void main(String A[])
    {
        RecursionX robj = new RecursionX();
        robj.Display();
    }
}

class RecursionX
{
    int iCnt = 5;
    public void Display()
    {
        if(iCnt>=1)
        {
            System.out.print(iCnt+"\t");
            iCnt--;
            Display();
        }
    }
}

class Assignment39_3
{
    public static void main(String A[])
    {
        RecursionX robj = new RecursionX();
        robj.Display();
    }
}

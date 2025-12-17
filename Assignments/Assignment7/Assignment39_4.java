class RecursionX
{
    char ch = 'A';
    public void Display()
    {
        if(ch<='F')
        {
            System.out.print(ch+"\t");
            ch++;
            Display();
        }
    }
}

class Assignment39_4
{
    public static void main(String A[])
    {
        RecursionX robj = new RecursionX();
        robj.Display();
    }
}

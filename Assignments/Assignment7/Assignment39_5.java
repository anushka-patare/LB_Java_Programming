class RecursionX
{
    char ch = 'a';
    public void Display()
    {
        if(ch<='f')
        {
            System.out.print(ch+"\t");
            ch++;
            Display();
        }
    }
}

class Assignment39_5
{
    public static void main(String A[])
    {
        RecursionX robj = new RecursionX();
        robj.Display();
    }
}

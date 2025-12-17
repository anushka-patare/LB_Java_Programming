

import java.util.*;
class RecursionX
{

    public void Display(int iNo)
    { 
        if(iNo >= 1)
        {
            System.out.print(iNo+"\t");
            iNo--;
            Display(iNo);
        }
    }
}
class Assignment40_3
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number:");
        int no = sobj.nextInt();

        RecursionX robj = new RecursionX();
        robj.Display(no);
    }
}

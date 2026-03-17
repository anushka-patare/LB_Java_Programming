import java.util.*;

class program620
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number :");
        int no = sobj.nextInt();

        int iDigit = 0;

        int iCount1= 0, iCount2 = 0;

        while(no != 0)
        {
            iDigit = no % 2;
            System.out.print(iDigit);
            no = no / 2;
           

            if(iDigit == 0)
            {
                iCount1++;
            }
            if(iDigit == 1)
            {
                iCount2++;
            }
         
        }

        System.out.printf("Frequency of 1 is : %d\n",iCount2);
        System.out.printf("Frequency of 0 is : %d\n",iCount1);

    }
}

import java.util.*;

class program798
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int i = 0;
        int iSum = 0;

        int Marks[] = new int[5];   // Dynamic memory allocation

        boolean Pass = true;
        boolean invalid = false;

        System.out.println("Enter marks : ");
        for(i = 0;i<Marks.length; i++)
        {
            Marks[i] = sobj.nextInt();  

            if(Marks[i] < 35)
            {
                Pass = false;
            }
            
            if(Marks[i] < 0 || Marks[i] > 100 )
            {
                invalid = true;
            }

            iSum = iSum + Marks[i];
           
        }

        if(invalid == true)
        {
            System.out.println("Invalid marks");
            return;
        }

        if(Pass == false)
        {
            System.out.println("Result : Fail");
            return;
        }

        float Average = (float)iSum / (float)5;

        System.out.println("Average Marks : "+Average);

        if(Average >= 75.0f)
        {
            System.out.println("Final Result : Distinction");
        }
        
        else if(Average >= 60.0f)
        {
            System.out.println("Final Result : First class");
        }
        
        else if(Average >= 50.0f)
        {
            System.out.println("Final Result : Second class");
        }
        else if(Average < 50.0f)
        {
            System.out.println("Final Result : Pass");
        }

        sobj.close();

    }
}
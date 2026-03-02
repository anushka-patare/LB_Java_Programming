package Assignment72;

import java.util.*;

class MatrixX
{
    public int iRow;
    public int iCol;

    public int Arr[][];

    public MatrixX(int a,int b)
    {
        this.iRow = a;
        this.iCol = b;

        Arr = new int[iRow][iCol];
    }

    public void Accept()
    {
        int i = 0, j=0;
        System.out.println("Enter elements into Matrix :");

        Scanner sobj = new Scanner(System.in);

        for(i = 0; i<iRow; i++)
        {
            System.out.println("Enter elements of row : "+(i+1));
            for(j=0; j<iCol; j++)
            {
                Arr[i][j] = sobj.nextInt();
            }
        }

    }

    public void Display()
    {
        int i = 0, j = 0;
        for(i = 0; i<iRow; i++)
        {
            for(j=0; j<iCol; j++)
            {
                System.out.print(Arr[i][j]+"\t");
            }
            
            System.out.println();
        }
     
    }

    public int CountFrequency(int iNo)
    {
        int iCount = 0;
        int i = 0, j = 0;
       
        for(i = 0; i<iRow; i++)
        {
            for(j=0; j<iCol; j++)
            {
                if(Arr[i][j] == iNo)
                {
                    iCount++;
                }
            }
        }
        return iCount;
    }

}
public class Assignment72_2
{
    public static void main(String A[])
    {
        int iValue = 0;
        Scanner sobj1 =new Scanner(System.in);

        System.out.println("Enter the number of rows : ");
        int iRow = sobj1.nextInt();

        System.out.println("Enter the number of Columns : ");
        int iCol = sobj1.nextInt();

        if(iRow != iCol)
        {
            System.out.println("Invalid number of rows and columns");
            System.out.println("Please enter square matix");
            return;
        }


        MatrixX mobj = new MatrixX(iRow, iCol);

        mobj.Accept();
        mobj.Display();

        System.out.println("Enter number to check its frequency :");
        iValue = sobj1.nextInt();
        
        System.out.println("Frequency of " +iValue+ " is :"+mobj.CountFrequency(iValue));
        
    }
}  


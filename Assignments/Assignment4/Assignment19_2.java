class Logic
{
    void displayGrade(int marks)
    {
         if(marks >= 90)
         {
            System.out.println("A grade");
         }
         else if(marks >= 80)
         {
            System.out.println("B grade");
         }
         else if(marks >= 70)
         {
            System.out.println("C grade");
         }
         else if(marks >= 60)
         {
            System.out.println("D grade");
         }
         else
         {
            System.out.println("F grade");
         }
    }
    
}
class Assignment19_2 
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.displayGrade(82);
    }
}

class Logic
{
    void checkLeapYear(int year)
    {
        if(year % 4 == 0)
        {
            System.out.println(" Year is leap");
        }
        else
        {
            System.out.println("Year is not leap");
        }
    }
}
class Assignment19_1 
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.checkLeapYear(2024);
    }
}

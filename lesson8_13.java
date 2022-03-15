/*Write a program to pass 2 integer numbers as parameters. If either of the 
two numbers is 0, display invalid entry and the program should end, if it 
is valid entry, divide the larger number with the smaller number and display
the result.*/
class lesson8_13
{
    public static void main(int a, int b)
    {
        float c;
        if(a == 0 || b == 0)
            System.out.println("Invalid entry");
        else
        {
            if(a > b)
                c = (float)a / b;
            else
                c = (float)b / a;
            System.out.println("Quotient: " +c);
        }
    }
}
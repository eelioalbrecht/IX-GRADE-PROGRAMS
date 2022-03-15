/*Write a program in java to find the product of first ten natural numbers
using for statement.*/
class prep8
{
    public static void main(String [] args)
    {
        int i, pro = 1;
        for(i = 1; i <=10; i++)
        {
            pro *= i;
        }
        System.out.println("Product: " +pro);
    }
}
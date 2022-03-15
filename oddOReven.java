import java.util.*;
class oddOReven
{
    public static void main(String [] args)
    {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter a number: ");
        double num = sc.nextDouble();
        if(num % 2 == 0)
        {
            System.out.println("Even Number");
        }
        else
        {
            System.out.println("Odd Number");   
        }
    }
}
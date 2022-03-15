import java.util.*;
class tax
{
    public static void main(String [] args)
    {
        double netpay, salary, tax;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Salary: ");
        salary = sc.nextDouble();
        if(salary > 20000)
        {
            System.out.println("Tax on salary: 20%");
            tax = 20;
        }
        else
        {
            System.out.println("Tax on salary: 10%");
            tax = 10;
        }
        netpay = salary - tax;
        System.out.println("Netpat: "+netpay);
    }
}

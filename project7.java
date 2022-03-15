import java.util.*;
class project7
{
    public static void main(String[]args)
    {
        int sales;
        double commision;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sales: ");
        sales = sc.nextInt();
        if(sales < 10000)
        commision = sales * 0.05;
        else if(sales >= 10000 && sales <= 50000)
        commision = sales * 0.08;
        else
        commision = sales * 0.10;
        System.out.println("The commision is: " + commision);
    }
}
import java.util.*;
class project4
{
    public static void main(String[]args)
    {
        int cost;
        double amount;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the cost: ");
        cost = sc.nextInt();
        if(cost <= 2000)
        amount = cost - (cost * 0.05);
        else if(cost >= 2001 && cost <= 5000)
        amount = cost - (cost * 0.25);
        else if(cost >= 5001 && cost <= 10000)
        amount = cost - (cost * 0.35);
        else
        amount = cost - (cost * 0.50);
        System.out.println("The amount: " + amount);
    }
}
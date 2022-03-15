import java.util.*;
class project5
{
    public static void main(String[]args)
    {
        int weight;
        double cost;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter weight: ");
        weight = sc.nextInt();
        if(weight <= 100)
        cost = 40;
        else
        cost = 40 + ((weight - 100) * 0.2);
        System.out.println("Cost of shipping: " + cost);
    }
}
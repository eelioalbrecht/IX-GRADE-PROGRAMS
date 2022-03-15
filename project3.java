import java.util.*;
class project3
{
    public static void main(String[]args)
    {
        int calls;
        double cost;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of calls: ");
        calls = sc.nextInt();
        if(calls <= 50)
        cost = 250;
        else if(calls >= 51 && calls <= 100)
        cost = 250 + ((calls - 50) * 1.5);
        else if(calls >= 101 && calls <= 200)
        cost = 250 + (50 * 1.5) + ((calls - 100) * 2);
        else
        cost = 250 + (50 * 1.5) + (100 * 2) + ((calls - 200) * 2.5);
        System.out.println("Cost is: " + cost);
    }
}
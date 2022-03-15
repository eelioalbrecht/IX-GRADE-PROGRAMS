import java.util.*;
class slab
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int units, rate;
        System.out.println("Enter the number units consumed");
        units = sc.nextInt();
        if(units <= 100)
            rate = units * 4;
        else if(units > 100 && units <= 300)
            rate = 100 * 4 + (units - 100) * 5;
        else if(units > 300 && units <= 500)
            rate = (100 * 4) + (units - 300) * 6;
        else
            rate = 100 * 4 + 200 * 5 + 200 * 6 + (units - 500) * 7;
        System.out.println("Rate: "+rate);
    }
}
/*If the total selling price of 15 items and the total profit earned on them is input through the
keyboard, write a program to find the cost price of one item.*/
import java.util.*;
class lesson6twentyfour
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        float tsp, tp, tcp, cp;
        System.out.println("Enter the total selling price:");
        tsp = sc.nextFloat();
        System.out.println("Enter the total profit:");
        tp = sc.nextFloat();
        tcp = tsp - tp; 
        cp = tcp / 15; 
        System.out.println("Cost Price of one item: " +cp);
    }
}
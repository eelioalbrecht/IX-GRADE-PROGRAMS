import java.util.*;
class mid1
{
    public static void main(String [] args)
    {
        int tc;
        float dis, r, ap;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Total Cost: ");
        tc = sc.nextInt();
        String gift;
        if(tc <= 2000)
        {
            r = 5;
            gift = "Calculator";
        }
        else if(tc <= 5000)
        {
            r = 25;
            gift = "School Bag";
        }
        else if(tc <= 10000)
        {
            r = 35;
            gift = "Wall Clock";
        }
        else
        {
            r = 50;
            gift = "Wrist Watch";
        }
        dis = (r / 100) * tc;
        ap = tc - dis;
        System.out.println("Total Cost: "+tc);
        System.out.println("Discunt: " +r+ "% or Rs." +dis);
        System.out.println("Amount Payable: Rs."+ap);
        System.out.println("Gift: " +gift);
    }
}
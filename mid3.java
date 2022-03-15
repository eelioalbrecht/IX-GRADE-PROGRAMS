import java.util.*;
class mid3
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        int dist, fare = 0;
        String taxiNo;
        System.out.print("Enter Taxi Number: ");
        taxiNo = sc.nextLine();
        System.out.print("Enter distance travelled: ");
        dist = sc.nextInt();
        if (dist <= 5)
            fare = 100;
        else if (dist <= 15)
            fare = 100 + (dist - 5) * 10;
        else if (dist <= 25)
            fare = 100 + 100 + (dist - 15) * 8;
        else
            fare = 100 + 100 + 80 + (dist - 25) * 5;
        System.out.println("Taxi No: " + taxiNo);
        System.out.println("Distance covered: " + dist);
        System.out.println("Amount: " + fare);
    }
}
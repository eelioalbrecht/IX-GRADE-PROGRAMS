/*WAP to find rate for the distance travelled by the traveller. Calculate rate
per kilometer according to the criteria given below*/
import java.util.*;
class distance
{
    public static void mai(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        double distance;
        System.out.println("Enter the Distance travelled: ");
        distance = sc.nextDouble();
        double r;
        if(distance <= 10)
            r = distance * 25;
        else if(distance >= 11 && distance <= 20)
            r = (distance * 25) + (distance - 10) * 35;
        else if(distance >=21 && distance <= 30)
            r = (distance * 25) + (distance - 20) * 45;
        else
            r = (distance * 25) + (distance - 30) * 50;
        System.out.println("Rate: " +r);
    }
}
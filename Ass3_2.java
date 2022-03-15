import java.util.Scanner;
class Ass3_2
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        double length, adg;
        length = sc.nextDouble();
        System.out.println("Enter Acceleration Due to Gravity: ");
        adg = sc.nextDouble();
        double T = 2 * (22 / 7) * Math.sqrt(length /adg);
        System.out.println("T: "+T);
    }
}
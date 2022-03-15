/* question */
import java.util.*;
class Employee_final4
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        double basic, DA, HRA, PF, net, gross;
        System.out.println("Enter the Basic Pay: ");
        basic = sc.nextDouble();
        DA = 0.25 * basic;
        HRA = 0.15 * basic;
        PF = 0.0833 * basic;
        gross = basic + DA + HRA + PF;
        net = gross - PF;
        System.out.println("Gross Pay: " +gross);
    }
    void company()
    {
        Employee_final4 one = new Employee_final4();
        one.company();
    }
}
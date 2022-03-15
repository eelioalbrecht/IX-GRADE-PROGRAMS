import java.util.*;
class Ass_1
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Perpendicular: ");
        double p = sc.nextDouble();
        System.out.println("Enter the Base: ");
        double b = sc.nextDouble();
        double rta = Math.sqrt(Math.pow(p , 2) + Math.pow(b , 2));
        System.out.println("Hypotenuse: " +rta);
    }
}
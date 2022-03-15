import java.util.Scanner;
class A3_3r
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        double p, a, b;
        System.out.println("Enter 2 numbers: ");
        a = sc.nextDouble();
        b = sc.nextDouble();
        p = Math.cbrt(a + b) / (a - b);
        System.out.println("Result: " +p);
    }
}
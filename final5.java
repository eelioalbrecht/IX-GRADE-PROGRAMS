/*Question*/
import java.util.*;
class final5
{
    public static void main(String [] args)
    {
        double square, cube;
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        n = sc.nextInt();
        square = Math.sqrt(n);
        cube = Math.cbrt(n);
        System.out.println("Cube Root of " +n+ " is" +cube);
        System.out.println("Square Root of " +n+ " is" +square);
    }
    void calc()
    {
        final5 root = new final5();
        root.calc();
    }
}
import java.util.*;
class project1
{
    public static void main(String[]args)
    {
        double P,R,T,A,CI;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter principal amount: ");
        P = sc.nextDouble();
        System.out.println("Enter rate percent: ");
        R = sc.nextDouble();
        System.out.println("Enter time: "); 
        T = sc.nextDouble();
        A = P + Math.pow((1 + R/100),T);
        CI = A - P;
        System.out.println("The amount is: " + A);
        System.out.println("The compound interest is: " + CI);
    }
}
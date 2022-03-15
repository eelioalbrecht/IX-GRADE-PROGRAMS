/*Write a program to accept a double number with 4
precision (3.4567) and use the Math.ceil(), Math.floor(),
Math.round(), Math.rint() respectively and display the
results.*/
import java.util.*;
class HW2
{
    void homework()
    {
        Scanner sc = new Scanner(System.in);
        double n, ceil, floor, round, rint;
        System.out.println("Enter a number with 4 decimal precisions: ");
        n = sc.nextDouble();
        ceil = Math.ceil(n);
        floor = Math.floor(n);
        round = Math.round(n);
        rint = Math.rint(n);
        System.out.println("Function - Math.ceil: "+ceil);
        System.out.println("Function - Math.floor: "+floor);
        System.out.println("Function - Math.round: "+round);
        System.out.println("Function - Math.rint: "+rint);
    }
    public static void main(String [] args)
    {
        HW2 obj = new HW2();
        obj.homework();
    }
}
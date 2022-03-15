/*Write a program to calculate and print the values of:-
Z=x^2 + y^2 / x + y
Where, x ranges from 0 to 50 and y is to be taken as input.*/
import java.util.*;
class lesson9_47
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int x, y, z;
        for(x = 0; x <= 50; x++)
        {
            System.out.println("Enter the value of y: ");
            y = sc.nextInt();
            z = (x * x + y * y) / (x + y);
            System.out.println("z: " +z);
        }
    }
}
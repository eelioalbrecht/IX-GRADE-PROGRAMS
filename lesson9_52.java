/*An interesting method of multiplication of integers (not very large numbers) 
is as follows. The method can be illustrated by the following example. If the 
numbers 17 and 19 are to be multiplied, they are put at the top of two columns 
as shown below:
 17              19
The numbers at the left hand side is successively divided by 2 (integer division)
while the other is successively multiplied by 2. The results are written one
below the other in their respective columns. The process is repeated till the 
column containing the division results reached 1. At this stage all the numbers
in the right hand column are struck off where numberscorresponding to it on the
left hand column is even.
 17               19
  8 (even)       -38-
  4 (even)       -76-
  2 (even)       -152-
  1               304
Now the remaining numbers on the right hand side are added: 19+304=323 which is
equal to the product of 17 and 19.
Write a program to input two 2-digit numbers and find their product using the
above technique.*/
import java.util.*;
class lesson9_52
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int a, b, i, s = 0;
        System.out.println("Enter 2 numbers: ");
        a = sc.nextInt();
        b = sc.nextInt();
        for(i = a; i >= 1; i /= 2)
        {
            if (i % 2 == 1)
                s += b;
            b *= 2;
        }
        System.out.println("Product: " +s);
    }
}
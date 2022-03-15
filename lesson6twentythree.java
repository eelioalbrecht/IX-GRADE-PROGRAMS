/*If the marks obtained by a student in five different subjects are input through the keyboard,
write a program to find out the aggregate marks and percentage marks obtained by the
student. Assume that the maximum marks that can be obtained by a student in each subject
is 100*/
import java.util.*;
class lesson6twentythree
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        float m1, m2, m3, m4, m5, agg, per;
        System.out.println("Enter the marks:");
        m1 = sc.nextFloat();
        m2 = sc.nextFloat();
        m3 = sc.nextFloat();
        m4 = sc.nextFloat();
        m5 = sc.nextFloat();
        agg = m1 + m2 + m3 + m4 + m5;
        per = agg / 500 * 100;
        System.out.println("Aggregate: " +agg);
        System.out.println("Percentage: " +per);
    }
}
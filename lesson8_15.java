/*Write a program to accept a mark obtained by a student in computer science
and print the grades accordingly:
    Marks     Grade
    Above 90    A
    70 to 89    B
    50 to 69    C
    Below 50    D*/

    
    
    
    
    
    
    
    
    import java.util.*;
class lesson8_15
{
    public static void main(String [] args)
    {
        int m;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks: ");
        m = sc.nextInt();
        if(m >= 90)
            System.out.println("Grade: A");
        else if(m >= 70)
            System.out.println("Grade: B");
        else if(m >= 50)
            System.out.println("Grade: C");
        else
            System.out.println("Grade: D");
    }
}
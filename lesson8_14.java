/*Write a program to accept three sides of a triangle as parameter and check 
whether it can form a triangle or not. If it forms a triangle, check whether 
it is an acute angled, obtuse angled or right-angled triangle.
(Hint: To form a triangle, each side should be less the sum of the other two 
sides.
    -> To form an acute angled triangle the square of every side should be 
        less than the sum of the squares of the other two sides.
    -> To form an obtuse angled triangle the square of any side should be 
        greater than the sum of the squares of the other two sides.
    -> To form an right angled triangle the square of any side should be 
        equal to the sum of the squares of the other two sides.)*/

class lesson8_14
{
    public static void main(int a, int b, int c)
    {
        if(a < b + c && b < c + a & c < a + b)
        {
            if(a*a<b*b+c*c && b*b<c*c+a*a && c*c<a*a+b*b)
                System.out.println("Acute angles triangle");
            else if(a*a>b*b+c*c || b*b>c*c+a*a || c*c>a*a+b*b)
                System.out.println("Obtuse angled triangle");
            else
                System.out.println("Right angled triangle");
        }
        else
            System.out.println("Does not from a triangle");
    }
}
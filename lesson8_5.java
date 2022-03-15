/*Write a program to accept an int type value as a parameter and print the 
square of it, if it is more than 120, otherwise print its cube.*/
class lesson8_5
{
    public static void main(int n)
    {
        if(n > 120)
            System.out.println("Square: " +(n * n));
        else
            System.out.println("Cube: " +(n * n * n));        
    }
}
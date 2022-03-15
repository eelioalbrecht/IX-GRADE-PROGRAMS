/*Write a program to initilaize three int variables a, b and c with 234, 456 and 712, and store the sum of the last digit of variables into d and display it*/
class fourteen
{
    public static void main()
    {
        int a = 234;
        int b = 456; 
        int c = 712;
        int d;
        d = a%10 + b%10 + c%10;      
        System.out.println("Sum of last digits: " +d);
    }
}
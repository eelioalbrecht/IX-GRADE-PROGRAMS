/*Write a program to initialize an int variable a with 76498, and from it extract the first digit and store it into a variable f and extract the last digit into a variable e and display both these digits*/
class fifteen
{
    public static void main()
    {
        int a = 76498;
        int f = a / 100000;
        int e = a%10;
        System.out.println("First Digit: " +f);
        System.out.println("Last Digit: " +e);
    }
}
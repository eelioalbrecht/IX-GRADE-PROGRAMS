/*Write a program to initialize two integer variables a and b with 5 and 6, reaspectively, and interchange them. Thus after interchangeing, a and b with be 6 snd 5*/
class thirteen
{
    public static void main()
    {
        int a = 5;
        int b = 6;
        System.out.println("BEFORE INTERCHANGING");
        System.out.println("a = 5 and b = 6");
        int t = a;
        a = b;
        b = t;
        System.out.println("AFTER INTERCHANGING");
        System.out.println("a =" +a+ "and b =" +b);
    }
}
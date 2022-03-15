/*16.3.2021*/
//Object Declaration in Main Function
class ObjectDeclaration
{
    void calc()
    {
        int a, b, c;
        a = 15;
        b = 16;
        c = a + b;
        System.out.println("The result: " + c);
    }
    public static void main()
    {
        ObjectDeclaration A = new ObjectDeclaration();
        A.calc();
    }
}
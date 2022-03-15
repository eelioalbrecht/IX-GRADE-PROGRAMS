class operator
{
    void calc()
    {
        int a, b, c;
        a = 15;
        b = 36; 
        c = 45;
        float add;
        int d = 100;
        add = (a + b + c) - d;
        System.out.println("Solution: " + add);
    }
    public static void main(String [] args)
    {
        operator CD = new operator();
        CD.calc();
    }
}
class As2test1
{
    void cal()
    {
        float E;
        int x = 12;
        int y = 13;
        E = (2 * x * x * y) + (y * y);
        System.out.println(E);
    }
    public static void main(String[]args)
    {
        As2test1 obj = new As2test1();
        obj.cal();
    }
}
class lesson9_22
{
    public static void main(String [] args)
    {
        int i, f = 1, s = 0, sum = 0, t;
        for (i = 1; i <= 20; i++)
        {
            t = f + s;
            sum += t;
            f = s;
            s = t;
            System.out.println("s "+s+"    t "+t+"    f "+f+"    sum "+sum);
        }
        System.out.print("Sum: " +sum);
    }
}
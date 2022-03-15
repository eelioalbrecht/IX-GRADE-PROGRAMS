class RANDOMfunction
{
    public static void main(String [] args)
    {
        int x = 1, y = 6, r;
        r = x + (int)(Math.random() * (y - x + 1));
        System.out.println(r);
        r = x + (int)(Math.random() * (y - x + 1));
        System.out.println(r);
        r = x + (int)(Math.random() * (y - x + 1));
        System.out.println(r);
    }
}
/*Write  a program using int variables to find the profit and profit percentage of a certain tracnsaction where S.P.= ₹10000 and C.P.= ₹7000*/
class ten
{
    public static void main()
    {
        int SP, CP;
        SP = 10000;
        CP = 7000;
        double pro, proPer;
        pro = SP - CP;
        proPer = (double)pro / CP * 100;
        System.out.println("Profit: " +pro);
        System.out.println("Profit %: " +proPer);
    }
}
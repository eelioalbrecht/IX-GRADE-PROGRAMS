/*Write a program which evaluates the expression E = 1/2mv². It takes input of m and v (using Scanner Input).*/
import java.util.*;
class Evaluate 
{
  public static void main(String[] args)
  {
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter Value Of M");
  int m = sc.nextInt();//input
  System.out.println("Enter Value Of V");
  int v = sc.nextInt();//input
  double e = 0.5*m*v*v;//process
  System.out.println("Answer = "+e);//output
}
}
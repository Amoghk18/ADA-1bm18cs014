import java.util.*;
class GCD{
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter two number whose GCD is needed");
    int a=s.nextInt();
    int b=s.nextInt();
    int rem=0;
    while(b!=0)
    {
      rem=a%b;
      a=b;
      b=rem;
    }
    System.out.println("GCD is "+a);
  }
}

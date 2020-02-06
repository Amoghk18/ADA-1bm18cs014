
import java.util.*;
class Tower_hanoi
{
  public static void main(String args[])
  {
  	Scanner s=new Scanner(System.in);
    System.out.println("Enter the number of discs");
    int n=s.nextInt();
    System.out.println("Enter the name of towers");
    char name[]= new char[n];
    for(int i=0;i<3;i++){
      name[i]=s.next().charAt(0);
    }
    Hanoi h = new Hanoi();
    h.towerhanoi(n,name[0],name[1],name[2]);
  }
}

class Hanoi{

  void towerhanoi(int n,char s,char t,char d){
  
  if(n==1){
    System.out.println("Move "+n+" disc from "+s+" to"+d+"\n");
    return;  
    }
    towerhanoi(n-1,s,d,t);
    System.out.println("Move "+n+" disc from "+s+" to"+d+"\n");
    towerhanoi(n-1,t,s,d);
  } 
}

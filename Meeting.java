import java.util.*;
class Meeting{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number of meetings");
    int n=sc.nextInt();
    int s[]=new int[n];
    int f[]=new int[n];
    System.out.println("Enter the start and end time of each meeting");
    for(int i=0;i<n;i++){
      System.out.println("Enter the start time of "+(i+1)+" meeting");
      s[i]=sc.nextInt();
      System.out.println("Enter the finish time of "+(i+1)+" meeting");
      f[i]=sc.nextInt();
    }
    InsertionSort I=new InsertionSort();
    s=I.sort(s);
    f=I.sort(f);
    
    System.out.print("Meetings that can happen are-->1 ");
    int c=1;
    for(int i=1;i<n;i++){
      if(s[i]>=f[i-1]){
      c++;
      System.out.print((i+1)+" ");
      }
    }
    System.out.println();
    System.out.println("Total number of meetings possible are "+c);
  }
}

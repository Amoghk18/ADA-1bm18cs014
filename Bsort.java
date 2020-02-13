
import java.util.*;
import java.util.Date;
class Bsort{
  public static void main(String a[]){
    Scanner s=new Scanner(System.in);
    System.out.println("enter the number of elements");
    int n=s.nextInt(); 
    Random r=new Random();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=r.nextInt(1000);
    }
    Date before=new Date();
    
    for(int i=0;i<n-1;i++){
      for(int j=0;j<n-i-1;j++){
        if(arr[j]>arr[j+1]){
          int temp=arr[j];
          arr[j]=arr[j+1];
          arr[j+1]=temp;
        }
      }
    }
    Date after=new Date();
    
    long timetaken = after.getTime()-before.getTime();
    System.out.println("Time in milliseconds="+timetaken+" ms");
    System.out.println("Sorted elements->");
      for(int i=0;i<n;i++){
        System.out.print(arr[i]+" ");
      }
  }
}

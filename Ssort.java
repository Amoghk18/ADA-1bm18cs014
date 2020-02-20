import java.util.*;
class Ssort{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the number of elements");
    int n=s.nextInt();
    Random r=new Random();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=r.nextInt(8000);
    }
    
    Date before=new Date();
    
    for(int i=0;i<n-1;i++){
      for(int j=i+1;j<n;j++){
        if(arr[i]>arr[j]){
          int temp=arr[j];
          arr[j]=arr[i];
          arr[i]=temp;
        }
      }
    }
    
    Date after=new Date();
    
    double tot_time=after.getTime() - before.getTime();
    
    for(int i=0;i<n;i++){
        System.out.print(arr[i]+" ");
      }
      System.out.println("Total time taken(milliseconds)= "+tot_time);
  }
}

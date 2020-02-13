import java.util.*;
class Klargest{
  public static void main(String a[]){
    Scanner s=new Scanner(System.in);
    System.out.println("enter the number of elements");
    int n=s.nextInt(); 
    System.out.println("enter the elements");
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=s.nextInt();
    }
    
     for(int i=0;i<n-1;i++){
      for(int j=0;j<n-i-1;j++){
        if(arr[j]>arr[j+1]){
          int temp=arr[j];
          arr[j]=arr[j+1];
          arr[j+1]=temp;
        }
      }
    }
    
    System.out.println("enter the number of largest elements");
    int k=s.nextInt();
    while(k>0){
       System.out.println(arr[n-1-k]+" ");
       k--;
    }
  }
}

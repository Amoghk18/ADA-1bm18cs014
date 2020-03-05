import java.util.*;
class InsertionSort{
  int[] sort(int arr[]){
     for(int i=1;i<arr.length;i++){
      int item=arr[i];
      int j=i-1;
      while(j>=0 && arr[j]>item){
        arr[j+1]=arr[j];
        j--;
      }
      arr[j+1]=item;
    }
    return arr;
  }
}
class Isort{
  public static void main(String ar[]){
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the number of elements");
    int n=s.nextInt();
   // System.out.println("Enter the elements");
    int arr[]=new int[n];
    Random r=new Random();
    for(int i=0;i<n;i++){
      arr[i]=r.nextInt(1000);
    }
    InsertionSort I=new InsertionSort(); 
    Date b=new Date();
    arr=I.sort(arr);
    Date a=new Date();
    double time=a.getTime() - b.getTime();
    System.out.println("Elements are -->");
    for(int i=0;i<n;i++){
      System.out.print(arr[i]+" ");
    }
    System.out.println();
    System.out.println("Time taken to sort(ms)= "+time);
  }
}

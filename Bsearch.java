import java.util.*;
class Bsearch{
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the number of elements");
    int n=s.nextInt();
    int arr[]=new int[n];
    System.out.println("Enter the elements");
    for(int i=0;i<n;i++){
      arr[i]=s.nextInt();
    }
    int first=0,mid=0;
    int last=n-1;
    int temp=0;
    int focc=-1,locc=-1,x=0,y=0;
     System.out.println("Enter the element to be searched");
     int key=s.nextInt();
    while(last>first)
    {
      mid=(first+last)/2;
      if(arr[mid]>key) last=mid;
      else if(arr[mid]<key) first=mid;
      else if(arr[mid]==key)
      {
      System.out.println("mid "+mid);
        temp=mid;
        while(true)
        {
          if(arr[temp]==arr[temp-1]) temp--;
          else{
          focc=temp;
          System.out.println("got first occurance");
          x=1;
          break;
          } 
        }
        temp=mid;
        while(true)
        {
          if(arr[temp]==arr[temp+1]) temp++;
          else{
          locc=temp;
          System.out.println("got last occurance");
          y=1;
          break;
          }
      }
     break;
    }
    break;
  }
  if(focc==-1 && locc==-1) System.out.println("Not found");
  else if(focc==locc) System.out.println("Found");
  else System.out.println("First occurance is "+focc+" and last occurance is "+locc);
}
}

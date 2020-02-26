import java.util.*;
class Recurlinear {

    static int search(int arr[],int key,int s){
        if(s==arr.length)
            return -1;
        if(arr[s]==key)
            return s;
        return search(arr,key,s+1);
    }

    public static void main(String a[]){
       Scanner  s=new Scanner(System.in);
       System.out.println("Enter number of elements in the array");
       int n=s.nextInt();
       System.out.println("Enter the elements");
       int arr[]=new int[n];
       for(int i=0;i<n;i++){
           arr[i]=s.nextInt();
       }
       System.out.println("ENter the element to be searched");
       int key=s.nextInt();
       int f=search(arr,key,0);
       if(f==-1) System.out.println("Not found");
       else System.out.println("Found at "+(f+1)+" position");
    }
}

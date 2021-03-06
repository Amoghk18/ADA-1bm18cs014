import java.util.*;
class sumBinEven1 {

    static ArrayList<Integer> convertBin(int n){
        ArrayList<Integer> a=new ArrayList<Integer>();
        //a.add(1);

        while(n>0){
            a.add(n%2);
            n=n/2;
        }
        return a;
    }

    static boolean binEven(int n){
        ArrayList<Integer> a=new ArrayList<Integer>();
        a=convertBin(n);
        int count=0;
        for(int i=0;i<a.size();i++){
            if(a.get(i)==1){
                count++;
            }
        }
        if(count % 2==0){
            return true;
        }
        else
            return false;
    }

    static int findSum(int arr[]){
        int sum=0;
        boolean a[]=new boolean[arr.length];
        for(int i=0;i<arr.length;i++){
            a[i]=binEven(arr[i]);
        }
        for(int i=0;i<arr.length;i++){
            if(a[i]){
                sum+=arr[i];
            }
        }

        return sum;
    }

    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter number of elements in the array");
        int n=s.nextInt();
        System.out.println("Enter the elements");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int sum=findSum(arr);
        System.out.println("Sum is "+sum);
    }
}

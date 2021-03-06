import java.util.*;
class SafeUnsafeIndex {
    final static int[] fib={0,1,1,2,3,5,8,13,21,34,55,89,144,233,377,610,987};
    static int c=0;
    static boolean search(int n){
        int x=0;
        for(int i=0;i<fib.length;i++){
            if(n==fib[i]){
                x=1;
                break;
            }
        }
        if(x==0) return false;
        else return true;
    }

    static int steps(int arr[],int n){     // -1 0 1 0 1 0 1 0 1 0 0  0  1
        if(n==arr.length-1)                //    0 1 2 3 4 5 6 7 8 9 10 11
            return n;
        //int p=n;

        for(int i=n+1;i<arr.length;i++){
            if(arr[i]==1){
                if(i!=arr.length-1){
                int x=steps(arr,i);
                if(search(x-i)){
                    c++;
                    if(n==-1){
                        if(search(i+1)){
                            c++;
                            break;
                        }
                        c=0;
                    }
                    if(n!=-1)
                    return i;
                }
                if(n!=-1)
                return x;
            }
                return i;
            }
        }
        return c;
    }

    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number of total steps");
        int n=s.nextInt();
        System.out.println("Enter the array elements safe-1 unsafe-0(last index always safe)");
        int st[]=new int[n];
        for(int i=0;i<n;i++){
            st[i]=s.nextInt();
        }

        int count=0,start=-1,f=0;
        if(search(n)){
            f=1;
            count++;
        }
        if(f==0){
            count=steps(st,-1);
        }
        if(count!=0)
        System.out.println("Minimum steps required are "+count);
        else
            System.out.println("Not possible");
    }
}

import java.util.*;
public class JhonTrot {

    static int it=1,i=0;

    static int search(int ar[],int n){
        for(int s=0;s<ar.length;s++){
            if(ar[s]==n)
                return s;
        }
        return -1;
    }

    static int check(int n,int ar[],int d[]){
        int w=search(ar,n);
        if(w<0)
            return -1;
        if(w==0 && d[w]==-1){
            return -1;
        }
        if(w==ar.length-1 && d[w]==1){
            return -1;
        }

        switch (d[w]){
            case -1:
                if(ar[w]>ar[w-1]){
                    return w;
                }
                break;
            case 1:
                if(ar[w]>ar[w+1]){
                    return w;
                }
                break;
        }


        return -1;
    }

    static int mobileEle(int[] ar,int[] d){
        int f,x=0;

 

        int arr[]=new int[ar.length];
        for(int i=0;i<ar.length;i++){
            arr[i]=ar[i];
        }
        Arrays.sort(arr);
        int j=-1;
        for(int i=ar.length-1;i>-1;i--){
            j=check(arr[i],ar,d);
            if(j==-1)
                continue;
            else break;
        }

        return j;
    }

    static void fact(int n){
        for(int i=1;i<=n;i++){
            it=it*i;
        }
    }


    static int change(int i){
        if(i==1)
            return -1;
        else
            return 1;
    }

    public static void main(String args[]){

        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number whose permutation you want");
        int n=s.nextInt();
        int d[]=new int[n];
        int ar[]=new int[n];
        int prev[]=new int[n];
        for(int i=0;i<n;i++){
            ar[i]=i+1;
            prev[i]=i+1;
            d[i]=-1;
        }
        fact(n);
        int ind=-1;
        for(int i=0;i<n;i++){
            System.out.print(ar[i]);
        }
        System.out.println();
        do{
            i++;
            if(i>=it)
                break;
            ind=mobileEle(ar,d);
            int temp=0;
            switch(d[ind]){
                case -1:
                    temp=ar[ind];
                    ar[ind]=ar[ind-1];
                    ar[ind-1]=temp;
                    ind--;
                    temp=d[ind];
                    d[ind]=d[ind+1];
                    d[ind+1]=temp;
                    break;
                case 1:
                    temp=ar[ind];
                    ar[ind]=ar[ind+1];
                    ar[ind+1]=temp;
                    ind++;
                    temp=d[ind];
                    d[ind]=d[ind-1];
                    d[ind-1]=temp;
                    break;
            }
            for(int k=0;k<d.length;k++){
                if(ar[k]>ar[ind]){
                    d[k]=change(d[k]);
                }
            }
            for(int i=0;i<n;i++){
                System.out.print(ar[i]);
            }
            System.out.println();

        }while(true);

    }
}

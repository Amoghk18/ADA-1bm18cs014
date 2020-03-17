import java.util.*;
class median {

    static int[] merge(int[] a,int[] b){
        int i=0,j=0,k=0;
        int temp[]=new int[2*a.length];
        while(i<a.length && j<a.length){
            if(a[i]<b[j]){
                temp[k]=a[i];
                i++;
            }
            else{
                temp[k]=b[j];
                j++;
            }
            k++;
        }
        while (i<a.length)
        {
            temp[k]=a[i];
            i++;
            k++;
        }
        while (j<b.length)
        {
            temp[k]=b[j];
            j++;
            k++;
        }

        return temp;
    }

    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("enter the number of elements of both the arrays");
        int n=s.nextInt();
        int a[]=new int[n];
        int b[]=new int[n];
        System.out.println("Enter elements for First array");
        for(int i=0;i<n;i++){a[i]=s.nextInt();}
        System.out.println("Enter elements for Second array");
        for(int i=0;i<n;i++){b[i]=s.nextInt();}

        int merged[]=new int[2*n];
        merged=merge(a,b);
        int median=(2*(n-1))/2;
        for(int i=0;i<2*n;i++){System.out.print(merged[i]+" ");}
        System.out.println("As the arrays will always have even numbers " +
                "medians are "+merged[median]+" and "+merged[median+1]+".\n" +
                "The exact median value is "+(float)(merged[median]+merged[median+1])/2);
    }
}

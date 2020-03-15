import java.util.*;
public class lexicoSort {
    static int ar[][],a[];
    static boolean v[];
    static ArrayList<Integer> p = new ArrayList<>();

    static int f = -1,top=-1;


    public static void main(String args[]) {
        Scanner x = new Scanner(System.in);
        int n = x.nextInt();
        ar = new int[n][n];
        v = new boolean[n];
        a = new int[n+1];
        System.out.println("Enter matrix");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                ar[i][j] = x.nextInt();
        }
        boolean b[]=new boolean[n];
        for (int i = 0; i < n; i++){
            v[i] = false;
            b[i]=false;
        }


        for(int l=0;l<n;l++)
            dfs(l);


        int c;
        for(int i=0;i<n;i++){
            c=0;
            for(int j=0;j<n;j++){
                if(ar[j][i]==0){
                    c++;
                }
            }
            if(c==n){
                b[i]=true;
            }
        }
        int temp=-1,o=-1;
        for(int i=0;i<n;i++){
            if(b[i] && o==-1){
                temp=a[i];
                o=i;
            }
            if(b[i] && o!=-1){
                a[o]=a[i];
                a[i]=temp;
            }
        }


        for(int z=top;z>-1;z--){
            System.out.print(a[z]+" ");
        }
    }

    public static void dfs(int i) {
        int j,u=0;
        for(int h=0;h<=top;h++){
            if(a[h]==i){u=1;break;}
        }if(u==0) {
            f++;
            p.add(i);
            v[i] = true;
        }

        for (j = 0; j < v.length; j++) {

            if (!v[j] && ar[i][j] == 1) {

                dfs(j);
            }
        }
        if(u==0){
            int x=p.get(f);
            top++;
            a[top]=x;

            p.remove(f);
            f--;
        }
    }

}


import java.util.*;
public class topoSort {
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
        for (int i = 0; i < n; i++)
            v[i] = false;

        for(int l=0;l<n;l++)
        dfs(l);

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

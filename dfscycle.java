import java.util.*;
public class dfscycle {
    static int ar[][];
    static boolean v[];
    static ArrayList<Integer> p = new ArrayList<>();
    static int f = 0;


    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        ar = new int[n][n];
        v = new boolean[n];
        System.out.println("Enter matrix");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                ar[i][j] = s.nextInt();
        }
        for (int i = 0; i < n; i++)
            v[i] = false;
        dfs(0);
     /*   if(f==0)
            System.out.println("Cycle is Absent");
        else
            System.out.println(f+" Cycles are Present");
		/*int c=0,p=0;
		for(int i=0;i<n;i++) {
			c=0;
			for(int j=0;j<n;j++) {
				if(ar[i][j]==0) c++;
			}
			if(c==n) {
				p=1;
				break;
			}
		}
		if(p==1) {
			System.out.println("disconnected");
		}
		else System.out.println("connected");*/
        if (f == 1) {
            System.out.println("Cycle present");
        } else System.out.println("Cycle absent");
    }

    public static void dfs(int i) {
        int j;
        v[i] = true;
        System.out.println(i);

        for (int k = 0; k < p.size(); k++) {
            if (ar[i][p.get(k)] == 1) {
                f = 1;
                break;
            }
        }


        for (j = 0; j < v.length; j++) {
            if (i == 0) {
                p.clear();
            }
            if (!v[j] && ar[i][j] == 1) {
                p.add(i);
                dfs(j);
            }


        }


    }

}

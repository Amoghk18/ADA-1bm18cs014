import java.util.*;
class DFS {

    static  int v[];
    static int x=0,y=0;
    static void dfs(int[][] ad,int x){
        int i;
        System.out.println(x);
        v[x] = 1;
        for(i=0;i<v.length;i++){
            if(ad[x][i]==1 && v[i]==0) {
                dfs(ad, i);
            }
        }
    }

    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number of vertices");
        int n=s.nextInt();

        int ad[][]=new int[n][n];
        v=new int[n];
        System.out.println("Enter the adjacency matrix");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                ad[i][j]=s.nextInt();
            }

        }

        v[0]=1;
        dfs(ad,0);
       int c=0,p=0;
		for(int i=0;i<n;i++) {
			c=0;
			for(int j=0;j<n;j++) {
				if(ad[i][j]==0) c++;
			}
			if(c==n) {
				p=1;
				break;
			}
		}
		if(p==1) {
			System.out.println("disconnected");
		}
		else System.out.println("connected");
    }
}

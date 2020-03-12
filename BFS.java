
    import java.util.*;
    class Q{
        int qu[];
        int f=0,r=-1;
        Q(int n){
            qu=new int[n];
        }

        void enq(int ele){
            if(r==qu.length-1){System.out.println("Queue full");return;}
            r++;
            qu[r]=ele;
        }
        void deq(){
            if(f>r){System.out.println("Queue empty");return;}
            f++;
        }
        void display(){
            for(int i=0;i<qu.length;i++){
                System.out.print(qu[i]+" ");
            }
        }
    }

    class BFS{

        static void bfs(int arr[][],int v[]){
            Q q=new Q(arr.length);
            for(int i=0;i<arr.length;i++){
                if(i==0){q.enq(i); v[0]=1;}
                for(int j=0;j<arr.length;j++){
                    if(arr[i][j]==1 && v[j]==0){
                        q.enq(j);
                        v[j]=1;
                    }
                }
                q.deq();
            }
            q.display();
        }

        public static void main(String a[]){
            Scanner s=new Scanner(System.in);
            System.out.println("Enter the number of vertices");
            int n=s.nextInt();
            int arr[][]=new int[n][n];
            int v[]=new int[n];
            for(int i=0;i<n;i++){v[i]=0;}
            System.out.println("Enter the adjacency matrix");
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    arr[i][j]=s.nextInt();
                }
            }

            bfs(arr,v);
        }
    }

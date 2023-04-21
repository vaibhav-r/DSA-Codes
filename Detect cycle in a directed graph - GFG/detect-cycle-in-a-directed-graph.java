//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class DriverClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            ArrayList<ArrayList<Integer>> list = new ArrayList<>();
            int V = sc.nextInt();
            int E = sc.nextInt();
            for (int i = 0; i < V; i++)
                list.add(i, new ArrayList<Integer>());
            for (int i = 0; i < E; i++) {
                int u = sc.nextInt();
                int v = sc.nextInt();
                list.get(u).add(v);
            }
            if (new Solution().isCyclic(V, list) == true)
                System.out.println("1");
            else
                System.out.println("0");
        }
    }
}
// } Driver Code Ends


/*Complete the function below*/

class Solution {
    // Function to detect cycle in a directed graph.
    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
        int[] n=new int[V];
        int[] ndfs=new int[V];
        for(int i=0;i<V;i++){
            if(n[i]==0)
                if(isCycle(i,adj,n,ndfs)) return true;
        }
        return false;
    }
    
    public boolean isCycle(int i,ArrayList<ArrayList<Integer>> adj, int[] n,int[] ndfs){
        n[i]=1;
        ndfs[i]=1;
        for(int it: adj.get(i)){
            if(n[it]==0){
                if(isCycle(it,adj,n,ndfs)) return true;
            }
            else if(ndfs[it]==1) return true;
        }
        
        ndfs[i]=0;
        return false;
    }
    
}
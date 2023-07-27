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
        
        /*int[]visited = new int[V];
        int[]path = new int[V];
        
        for(int i =0 ; i<V ; i++)
        {
            if(visited[i]==0) 
            {
                if(dfs(i,visited,path,adj)==true)return true;
            }
        }
        return false;*/
        
        //using toposort
                int[]indegree = new int[V];
        
        for(int i=0 ; i<V ;i++)
        {
            for(int u : adj.get(i))
            {
                indegree[u]++;
            }
        }
        
        Queue<Integer>q = new LinkedList<>();
        
        for(int i =0 ; i<V ;i++)
        {
            if(indegree[i]==0)
            q.offer(i);
        }
    
        int k=0;
        while(!q.isEmpty())
        {
            int node = q.remove();
            k++;
            for(int u : adj.get(node))
            {
                indegree[u]--;
                if(indegree[u]==0) q.add(u);
            }
        }
        if(k==V)return false;
        return true;

        
    }
    /*boolean dfs(int node , int[]visited , int[]path ,ArrayList<ArrayList<Integer>> adj )
    {
        visited[node]=1;
        path[node]=1;
        
        for(int u : adj.get(node))
        {
            if(visited[u]==0)
            {
                if(dfs(u,visited,path,adj)==true)return true;
            }
            else if(path[u]==1)
            {
                return true;
            }
        }
        path[node]=0;
        return false;
    }*/
}
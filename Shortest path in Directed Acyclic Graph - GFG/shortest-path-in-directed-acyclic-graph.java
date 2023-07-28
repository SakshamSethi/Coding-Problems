//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while (T-- > 0) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int[][] edge = new int[m][3];
			for (int i = 0; i < m; i++) {
				edge[i][0] = sc.nextInt();
				edge[i][1] = sc.nextInt();
				edge[i][2] = sc.nextInt();
			}
			Solution obj = new Solution();
			int res[] = obj.shortestPath(n, m,edge);
			for (int i = 0; i < n; i++) {
				System.out.print(res[i] + " ");
			}
			System.out.println();
		}
	}
}
// } Driver Code Ends


//User function Template for Java
class Solution {
    class Pair
    {
        int first , second ;
        Pair(int first  , int second )
        {
            this.first = first ;
            this . second = second ;
        }
    }
    
	public int[] shortestPath(int N,int M, int[][] edges) {
	
	ArrayList<ArrayList<Pair>> adj = new ArrayList<>();    
	    
	    for(int i =0 ; i< N ; i++)
	    {
	        ArrayList<Pair>temp = new ArrayList<Pair>();
	        adj.add(temp);
	    }
	    
	    for(int i =0 ; i<M ; i++)
	    {
	        int u = edges[i][0];
	        int v = edges[i][1];
	        int wt = edges[i][2];
	        
	        adj.get(u).add(new Pair(v,wt));
	    }
	    
	    int[]vis = new int[N];
	    Stack<Integer>st = new Stack();
	    
	    for(int i=0 ; i<N ; i++)
	    {
	        if(vis[i]==0)
	        {
	            toposort(i,vis,adj,st);
	        }
	    }
	    
	    int[]dist = new int[N];
	    Arrays.fill(dist , (int)1e9);
	    dist[0]=0;
	    while(!st.isEmpty())
	    {
	        int node = st.pop();
	        
	        for(int i = 0 ; i<adj.get(node).size();i++)
	        {
	            int v = adj.get(node).get(i).first;
	            int wt = adj.get(node).get(i).second;
	            
	            if(dist[node]+wt < dist[v])
	            {
	                dist[v]=dist[node]+wt;
	            }
	        }
	    }
	    
	    for(int i=0 ; i<N; i++)
	    {
	        if(dist[i]==(int)1e9) dist[i]=-1;
	    }
	    return dist;
	}
	void toposort(int i , int[]vis , ArrayList<ArrayList<Pair>>adj , Stack<Integer> st)
	{
	    vis[i]=1;
	    
	    for(int u=0 ; u<adj.get(i).size();u++)
	    {
	        int v = adj.get(i).get(u).first;
	        if(vis[v]==0)
	        {
                toposort(v,vis,adj,st);
	        }
	    }
	    
	    st.push(i);
	    return;
	}
}
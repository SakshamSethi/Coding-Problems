//{ Driver Code Starts


import java.util.*;
import java.io.*;
import java.lang.*;

public class Main{
	static BufferedReader br;
	static PrintWriter ot;
    public static void main(String args[]) throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		ot = new PrintWriter(System.out);
		int t = Integer.parseInt(br.readLine().trim());
		while(t-- > 0){
			String s[] = br.readLine().trim().split(" ");
			int V = Integer.parseInt(s[0]);
			int E = Integer.parseInt(s[1]);
			int edges[][] = new int[E][3];
			for(int i = 0; i < E; i++){
				s = br.readLine().trim().split(" ");
				edges[i][0] = Integer.parseInt(s[0]);
				edges[i][1] = Integer.parseInt(s[1]);
				edges[i][2] = Integer.parseInt(s[2]);
			}
			ot.println(new Solution().spanningTree(V, E, edges));
		}
		ot.close();
	}
}
// } Driver Code Ends


// User function Template for Java
class Pair
{
    int first , second;
    Pair(int first , int second)
    {
        this.first = first ;
        this.second = second;
    }
}
class Solution{
	static int spanningTree(int V, int E, int edges[][]){
	    
	  
	    
/*	    ArrayList<ArrayList<Pair>> adj = new ArrayList<>(); 
        for(int i = 0;i<=E ;i++) {
            adj.add(new ArrayList<>()); 
        }
	    for(int i=0 ; i<E ; i++)
	    {
	        adj.get(edges[i][0]).add(new Pair(edges[i][1],edges[i][2]));
	        adj.get(edges[i][1]).add(new Pair(edges[i][0],edges[i][2]));
	    }
	
        int[]visited = new int[V];
        PriorityQueue<Pair> q = new PriorityQueue<Pair>((x,y)->x.first-y.first);
        q.add(new Pair(0,0));
        int sum=0;
        
	    while(!q.isEmpty())
	    {
	        int node = q.peek().second;
	        int wt = q.peek().first;
	        q.poll();
	        if(visited[node]==1)
	        {
	         continue;
	        }
	        visited[node]=1;
	        sum+=wt;
	        
	        for(Pair it : adj.get(node))
	        {
	            int adjNode = it.first;
	            int edgeW = it.second;
	            
	            if(visited[adjNode]==0)
	            {
	                q.add(new Pair(edgeW,adjNode));
	            }
	        }
	        
	    }
	    
	    return sum; */
	    
	    
	    // Using Kruskals Algo : Disjoint Set Data Structure :)
	    
  List<Edge> adj = new ArrayList<Edge>();
        // O(N + E)
        
            for (int i = 0; i < E ; i++) {
                int adjNode = edges[i][1];
                int wt = edges[i][2];
                int node = edges[i][0];
                Edge temp = new Edge(node, adjNode, wt);
                adj.add(temp);
            }
        
        DisjointSet ds = new DisjointSet(V);
        // M log M
        Collections.sort(adj);
        int mstWt = 0;
        // M x 4 x alpha x 2
        for (int i = 0; i < adj.size(); i++) {
            int wt = adj.get(i).weight;
            int u = adj.get(i).src;
            int v = adj.get(i).dest;

            if (ds.findUPar(u) != ds.findUPar(v)) {
                mstWt += wt;
                ds.unionBySize(u, v);
            }
        }

        return mstWt;

	}
	

}
class Edge implements Comparable<Edge> {
    int src, dest, weight;
    Edge(int _src, int _dest, int _wt) {
        this.src = _src; this.dest = _dest; this.weight = _wt;
    }
    // Comparator function used for
    // sorting edgesbased on their weight
    public int compareTo(Edge compareEdge) {
        return this.weight - compareEdge.weight;
    }
};
class DisjointSet {
    List<Integer> rank = new ArrayList<>();
    List<Integer> parent = new ArrayList<>();
    List<Integer> size = new ArrayList<>();
    public DisjointSet(int n) {
        for (int i = 0; i <= n; i++) {
            rank.add(0);
            parent.add(i);
            size.add(1);
        }
    }

    public int findUPar(int node) {
        if (node == parent.get(node)) {
            return node;
        }
        int ulp = findUPar(parent.get(node));
        parent.set(node, ulp);
        return parent.get(node);
    }

    public void unionByRank(int u, int v) {
        int ulp_u = findUPar(u);
        int ulp_v = findUPar(v);
        if (ulp_u == ulp_v) return;
        if (rank.get(ulp_u) < rank.get(ulp_v)) {
            parent.set(ulp_u, ulp_v);
        } else if (rank.get(ulp_v) < rank.get(ulp_u)) {
            parent.set(ulp_v, ulp_u);
        } else {
            parent.set(ulp_v, ulp_u);
            int rankU = rank.get(ulp_u);
            rank.set(ulp_u, rankU + 1);
        }
    }

    public void unionBySize(int u, int v) {
        int ulp_u = findUPar(u);
        int ulp_v = findUPar(v);
        if (ulp_u == ulp_v) return;
        if (size.get(ulp_u) < size.get(ulp_v)) {
            parent.set(ulp_u, ulp_v);
            size.set(ulp_v, size.get(ulp_v) + size.get(ulp_u));
        } else {
            parent.set(ulp_v, ulp_u);
            size.set(ulp_u, size.get(ulp_u) + size.get(ulp_v));
        }
    }
}
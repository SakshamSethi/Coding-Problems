class Solution {
    public int[] findOrder(int V, int[][] prerequisites) {
         List<ArrayList<Integer>>adj = new ArrayList();
      
      for(int i = 0;i <V ; i++)
        adj.add(new ArrayList<Integer>());
      
      int m = prerequisites.length;
      
      for(int i=0;i<m;i++)
      {
        adj.get(prerequisites[i][1]).add(prerequisites[i][0]);
        
        }
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
      
        int[]toposort = new int[V];
        int k=0;
        while(!q.isEmpty())
        {
            int node = q.remove();
            toposort[k++]=node;
       
            for(int u : adj.get(node))
            {
                indegree[u]--;
                if(indegree[u]==0) q.add(u);
            }
        }
    
       if(k==V)return toposort;
      return new int[0];
    }
}
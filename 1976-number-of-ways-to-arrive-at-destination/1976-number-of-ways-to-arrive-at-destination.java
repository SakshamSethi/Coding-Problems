class Solution {
    public int countPaths(int n, int[][] roads) {
        int mod=(int)(1e9+7);
        List<Pair>[] adj=new ArrayList[n];
        for(int i=0;i<n;i++)adj[i]=new ArrayList<>();
        for(int[] road:roads)
        {
            adj[road[0]].add(new Pair((long)road[2],road[1]));
            adj[road[1]].add(new Pair((long)road[2],road[0]));
        }
        PriorityQueue<Pair> pq=new PriorityQueue<>((a,b)->Long.compare(a.dist,b.dist));
        long[] dist=new long[n];Arrays.fill(dist,Long.MAX_VALUE/2);dist[0]=0;
        int[] ways=new int[n];ways[0]=1;
        pq.offer(new Pair(0,0));
        while(!pq.isEmpty())
        {
            Pair temp=pq.poll();
            long dst=(long)temp.dist;
            for(Pair nei:adj[temp.node])
            {
                long ndst=(long)nei.dist;
                if(dst+ndst<dist[nei.node]){
                    pq.offer(new Pair(dst+ndst,nei.node));
                    dist[nei.node]=ndst+dst;
                    ways[nei.node]=ways[temp.node]%mod;
                }
                else if(dst+ndst==dist[nei.node]){
                    ways[nei.node]=(ways[nei.node]%mod + ways[temp.node]%mod)%mod;
                }
            }
        }
        return (ways[n-1]%mod);
    }
}
class Pair{
    int node;
    long dist;
    Pair(long dist,int node){
        this.dist=dist;
        this.node=node;
    }
}
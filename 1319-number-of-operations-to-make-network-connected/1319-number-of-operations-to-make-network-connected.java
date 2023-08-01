class DisjointSet
{
  List<Integer>parent = new ArrayList<>();
  List<Integer>size = new ArrayList<>();
  int extra ;
  public DisjointSet(int n)
  {
    for(int i=0 ; i<n ; i++)
    {
      parent.add(i);
      size.add(1);
      
    }
    extra=0;
  }
  public int findUPar(int node)
  {
    if(node==parent.get(node)) return node ;
    
    int ulp = findUPar(parent.get(node));
    parent.set(node,ulp);
    return ulp;
  }
  public void unionBySize(int u , int v)
  {
    int up_u = findUPar(u);
        int up_v = findUPar(v);
    
    if(up_u==up_v){
      extra++;
      return;
    }
    if(size.get(up_u) < size.get(up_v))
    {
      parent.set(up_u , up_v);
      size.set(up_v , size.get(up_u)+size.get(up_v));
    }
    else
    {
      parent.set(up_v , up_u);
      size.set(up_u , size.get(up_u)+size.get(up_v));
    }
  }
}
class Solution {
    public int makeConnected(int n, int[][] connections) {
        DisjointSet ds = new DisjointSet(n);
      
      for(int[] arr : connections)
      {
        ds.unionBySize(arr[0],arr[1]);
      }
      
      int ans=-1;
      for(int i=0 ; i< n ;i++)
      {
        if(ds.parent.get(i)==i) ans++;
      }
      System.out.print(ds.extra+" "+ans);
      return ds.extra>=ans?ans:-1;
    }
}
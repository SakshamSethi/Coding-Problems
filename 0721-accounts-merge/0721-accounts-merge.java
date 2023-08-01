class DisjointSet
{
  List<Integer> parent = new ArrayList<>();
  List<Integer> size = new ArrayList<>();
  
  DisjointSet(int n)
  {
    for(int i=0 ; i< n ; i++)
    {
      parent.add(i);
      size.add(1);
    }
  }
  int findUPar(int node)
  {
    if(node == parent.get(node)) return node;
    
    int ulp = findUPar(parent.get(node));
    parent.set(node,ulp);
    return ulp;
  }
  void unionBySize(int u , int v)
  {
    int upu = findUPar(u);
    int upv = findUPar(v);
    
    if(upu==upv)return;
    
    if(size.get(upu)<size.get(upv))
    {
      parent.set(upu,upv);
      size.set(upv , size.get(upu)+size.get(upv));
    }
    else
    {
            parent.set(upv,upu);
      size.set(upu , size.get(upu)+size.get(upv));
    }
  }
}

class Solution {
    public List<List<String>> accountsMerge(List<List<String>> accounts) {
        
      int  n = accounts.size();
      DisjointSet ds = new DisjointSet(n);
      HashMap<String , Integer> map = new HashMap<>();
      
      for(int i = 0 ; i<n ; i++)
      {
        for(int j =1 ; j<accounts.get(i).size() ;j++)
        {
          String s = accounts.get(i).get(j);
          if(!map.containsKey(s))
          {
            map.put(s,i);
          }
          else
          {
            ds.unionBySize(i , map.get(s));
          }
        }
      }
      
      // Map ready krne k baad ab Merge krne ka hai 
      
      ArrayList<String>[] mergedmails = new ArrayList[n];
      for(int i =0 ; i< n ; i++) mergedmails[i] = new ArrayList<String>();
      
      
      
      for(Map.Entry<String , Integer> it : map.entrySet())
      {
          String mail = it.getKey();
          int node = ds.findUPar(it.getValue());
         mergedmails[node].add(mail);
      }
      List<List<String>> ans = new ArrayList<>();
      for(int i =0 ; i< n ; i++)
      {
        if(mergedmails[i].size()==0)continue;
        
        Collections.sort(mergedmails[i]);
        List<String>temp = new ArrayList<>();
        temp.add(accounts.get(i).get(0));
        
        for(String str : mergedmails[i])
          temp.add(str);
        
        ans.add(temp);
      }
      return ans;
          
    }
}
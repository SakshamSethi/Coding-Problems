class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        
    List<List<Integer>> ans = new ArrayList<>();
        
     Arrays.sort(candidates);
        
       combo(candidates,target,ans,new ArrayList<Integer>(),0);
        
        return ans;
        
    }
    
static void combo(int[] can , int t ,List<List<Integer>>ans,ArrayList<Integer>curr,int start)
{
    if(t==0)
    {
       
        ans.add(new ArrayList<Integer>(curr));
        return ;
    }
    
    if(t>0)
    {
        for(int i=start;i<can.length;i++)
        {
            if(i>start && can[i]==can[i-1])continue;
            
            curr.add(can[i]);
            
            combo(can,t-can[i],ans,curr,i+1);
            curr.remove(curr.size()-1);
        }
        
    }
    return;
}
    
}
class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        
        List<List<Integer>> res = new ArrayList<>();
    ans(res, new ArrayList<Integer>(),candidates,target,0);
        return res;
        
    }
static void ans(List<List<Integer>> res, ArrayList<Integer>curr , int[] can, int target ,int start)
{
    if(target>0)
    {
        for(int i=start;i<can.length;i++)
        {
            curr.add(can[i]);
            ans(res,curr,can,target-can[i],i);
            curr.remove(curr.size()-1);
        }
    }
    else if(target==0)
    {  res.add(new ArrayList<>(curr));
    }
        return;
    
}
}
class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        // to remove duplicates in the answer 
        
        List<List<Integer>> ans = new ArrayList();
        List<Integer> temp = new ArrayList();
        
        compute(candidates  , target , temp , ans ,0);
        return ans;
    }
    void compute(int[] arr , int target ,List<Integer> temp, List<List<Integer>> ans,int start )
    {
     
        
            if(target==0)
            {
                ans.add(new ArrayList(temp));
                  return ;
            }
          
        
        if(target<0)return ;
                 
        for(int i = start ; i< arr.length ; i++)
        {
            if(i>start && arr[i]==arr[i-1])continue;
            
            temp.add(arr[i]);
            compute(arr,target-arr[i],temp,ans,i+1);
            temp.remove(temp.size()-1);
            
        }
        
        
    }
}
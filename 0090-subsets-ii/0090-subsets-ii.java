class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        
        List<List<Integer>>ans = new ArrayList<>();
        Arrays.sort(nums);
        check(ans,nums,0,new ArrayList<Integer>());
        return ans;
    }
    static void check(List<List<Integer>>ans,int[] nums,int i, ArrayList<Integer>curr)
    {
     
                
            ans.add(new ArrayList<Integer>(curr));
     
        
      
            
          
        for(int start = i;start<nums.length ; start++)
        {
            if(start>i && nums[start]==nums[start-1]) continue;
            
            curr.add(nums[start]);
            check(ans,nums,start+1,curr);
            curr.remove(curr.size()-1);
        }
            
        
    
        
        return;
        
    }
    
}
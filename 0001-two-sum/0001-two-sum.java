class Solution {
    public int[] twoSum(int[] nums, int target) {
     
    Map<Integer,Integer> hs = new HashMap<>();
        
        int[] ans = new int[2];
        hs.put(nums[0],0);
        
        for(int i = 1 ; i<nums.length;i++)
        {
            if(hs.containsKey(target-nums[i]))
            {
                ans[0] = hs.get(target-nums[i]);
                ans[1]=i;
                break;
            }
            
            hs.put(nums[i],i);
        }
        return ans;
        
    }
}
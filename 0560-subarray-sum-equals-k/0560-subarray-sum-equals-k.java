class Solution {
    public int subarraySum(int[] nums, int k) {
     
        int count = 0;
        
        int n = nums.length;
        
        HashMap<Integer,Integer> hmap = new HashMap();
        hmap.put(0,1);
        int curSum =0 ;
        
        for(int i=0 ; i<n ; i++)
        {
            curSum+=nums[i];
            
            if(hmap.containsKey(curSum-k))  
            {
                count+=hmap.get(curSum-k);
            }
            hmap.put(curSum, hmap.getOrDefault(curSum,0)+1);
        }
        return count;
    }
}
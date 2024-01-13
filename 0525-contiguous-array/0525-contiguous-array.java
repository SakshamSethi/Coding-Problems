class Solution {
    public int findMaxLength(int[] nums) {
        
        // similar to maximum sub array sum equals k 
        
        int start = 0;
        int end = 0;
        
        int n = nums.length;
        
        for(int i =0 ; i< n ; i++)
        {
            if(nums[i]==0) nums[i]=-1;
        }
        
        HashMap<Integer,Integer> hmap = new HashMap();
        
        int currSum = 0;
        int len = 0;
        
        for(int i=0 ; i<n ; i++)
        {
            currSum+=nums[i];
            
            if(currSum == 0)
            {
                start=0;
                end = i;
                len = Math.max(len, end-start+1);
            }
            
            
            if(hmap.containsKey(currSum))
            {
                start = hmap.get(currSum)+1;
                end = i;
                len = Math.max(len , end-start+1);
                
            }
           else  hmap.put(currSum,i);
            
        }
        
        return len;
        
    }
}
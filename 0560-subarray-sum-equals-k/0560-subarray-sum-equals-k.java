class Solution {
    public int subarraySum(int[] nums, int k) {
        
        
        // This Approach Only works for +ve numbers
      /*  int max =0;
        int sum=nums[0];
int n = nums.length;        int j=0;int i=0;
        while( j<n)
        {
       while(i<j && sum>k)
       {
           sum-=nums[i];
           i++;
       }
            
            if(sum==k) max++;
            
        j++;
       if(j<n) sum+=nums[j];      
        }
        return max;
    */
        // Have to use prefix sum property inlcuding a hash map for solving this problem having -ve integers
        
        Map<Integer,Integer> ps = new HashMap<>(); //sum and frequency of sum that how many times that sum has occured during the traversal 
        
        int count =0;
        int sum=0;
        ps.put(0,1); // for initial encounter 
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
            
            
            if(ps.containsKey(sum-k))
                count += ps.get(sum-k);
            ps.put(sum, ps.getOrDefault(sum,0)+1);
            
        }
        return count;
    }
}
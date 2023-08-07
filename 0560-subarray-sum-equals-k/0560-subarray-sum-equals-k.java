class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length ;
      int prefixSum = 0;
      HashMap<Integer,Integer> prefixMap = new HashMap<>();
      
      prefixMap.put(0,1);
      int counter=0;
      for(int i=0 ; i<n ; i++)
      {
        prefixSum+=nums[i];
        
        if(prefixMap.containsKey(prefixSum-k))
        {
          counter+=(prefixMap.get(prefixSum-k));
        }
        prefixMap.put(prefixSum,prefixMap.getOrDefault(prefixSum,0)+1);
      }
      return counter;
      
    }
}
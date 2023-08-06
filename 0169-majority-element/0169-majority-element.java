class Solution {
    public int majorityElement(int[] nums) {
      
      // HashMap solution 
      
      TreeMap<Integer,Integer> map = new TreeMap<>();
      int ans=-1;
      for(int i=0 ; i<nums.length ; i++)
      {
        if(!map.containsKey(nums[i]))
        {
           map.put(nums[i],1);
      
        }
    
        else {
               map.put(nums[i] , map.get(nums[i])+1);
        }
        
        if(map.get(nums[i])>nums.length/2)
        {
          ans = nums[i];
          break;
        }
      }

      return ans;
      
    }
}
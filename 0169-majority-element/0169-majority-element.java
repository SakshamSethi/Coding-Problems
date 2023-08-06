class Solution {
    public int majorityElement(int[] nums) {
      
      // HashMap solution 
      
   /*   TreeMap<Integer,Integer> map = new TreeMap<>();
      int ans=-1;
      for(int i=0 ; i<nums.length ; i++)
      {
        if(map.containsKey(nums[i]))
        {
          
          map.put(nums[i] , map.get(nums[i])+1);
        }
    
        else {  map.put(nums[i],0);
             }
        if(map.get(nums[i])>nums.length/2)
        {
          ans = nums[i];
          break;
        }
      }

      return ans; */
      
      // Moore's Voting algo 
      
      int count =1 ;
      int ele = nums[0];
      int n = nums.length;
      
      for(int i=1 ; i<n ; i++)
      {
        if(count==0) ele=nums[i];
        
        if(ele == nums[i]) count++;
        else count --;
        
        
      }
      return ele;
      
    }
}
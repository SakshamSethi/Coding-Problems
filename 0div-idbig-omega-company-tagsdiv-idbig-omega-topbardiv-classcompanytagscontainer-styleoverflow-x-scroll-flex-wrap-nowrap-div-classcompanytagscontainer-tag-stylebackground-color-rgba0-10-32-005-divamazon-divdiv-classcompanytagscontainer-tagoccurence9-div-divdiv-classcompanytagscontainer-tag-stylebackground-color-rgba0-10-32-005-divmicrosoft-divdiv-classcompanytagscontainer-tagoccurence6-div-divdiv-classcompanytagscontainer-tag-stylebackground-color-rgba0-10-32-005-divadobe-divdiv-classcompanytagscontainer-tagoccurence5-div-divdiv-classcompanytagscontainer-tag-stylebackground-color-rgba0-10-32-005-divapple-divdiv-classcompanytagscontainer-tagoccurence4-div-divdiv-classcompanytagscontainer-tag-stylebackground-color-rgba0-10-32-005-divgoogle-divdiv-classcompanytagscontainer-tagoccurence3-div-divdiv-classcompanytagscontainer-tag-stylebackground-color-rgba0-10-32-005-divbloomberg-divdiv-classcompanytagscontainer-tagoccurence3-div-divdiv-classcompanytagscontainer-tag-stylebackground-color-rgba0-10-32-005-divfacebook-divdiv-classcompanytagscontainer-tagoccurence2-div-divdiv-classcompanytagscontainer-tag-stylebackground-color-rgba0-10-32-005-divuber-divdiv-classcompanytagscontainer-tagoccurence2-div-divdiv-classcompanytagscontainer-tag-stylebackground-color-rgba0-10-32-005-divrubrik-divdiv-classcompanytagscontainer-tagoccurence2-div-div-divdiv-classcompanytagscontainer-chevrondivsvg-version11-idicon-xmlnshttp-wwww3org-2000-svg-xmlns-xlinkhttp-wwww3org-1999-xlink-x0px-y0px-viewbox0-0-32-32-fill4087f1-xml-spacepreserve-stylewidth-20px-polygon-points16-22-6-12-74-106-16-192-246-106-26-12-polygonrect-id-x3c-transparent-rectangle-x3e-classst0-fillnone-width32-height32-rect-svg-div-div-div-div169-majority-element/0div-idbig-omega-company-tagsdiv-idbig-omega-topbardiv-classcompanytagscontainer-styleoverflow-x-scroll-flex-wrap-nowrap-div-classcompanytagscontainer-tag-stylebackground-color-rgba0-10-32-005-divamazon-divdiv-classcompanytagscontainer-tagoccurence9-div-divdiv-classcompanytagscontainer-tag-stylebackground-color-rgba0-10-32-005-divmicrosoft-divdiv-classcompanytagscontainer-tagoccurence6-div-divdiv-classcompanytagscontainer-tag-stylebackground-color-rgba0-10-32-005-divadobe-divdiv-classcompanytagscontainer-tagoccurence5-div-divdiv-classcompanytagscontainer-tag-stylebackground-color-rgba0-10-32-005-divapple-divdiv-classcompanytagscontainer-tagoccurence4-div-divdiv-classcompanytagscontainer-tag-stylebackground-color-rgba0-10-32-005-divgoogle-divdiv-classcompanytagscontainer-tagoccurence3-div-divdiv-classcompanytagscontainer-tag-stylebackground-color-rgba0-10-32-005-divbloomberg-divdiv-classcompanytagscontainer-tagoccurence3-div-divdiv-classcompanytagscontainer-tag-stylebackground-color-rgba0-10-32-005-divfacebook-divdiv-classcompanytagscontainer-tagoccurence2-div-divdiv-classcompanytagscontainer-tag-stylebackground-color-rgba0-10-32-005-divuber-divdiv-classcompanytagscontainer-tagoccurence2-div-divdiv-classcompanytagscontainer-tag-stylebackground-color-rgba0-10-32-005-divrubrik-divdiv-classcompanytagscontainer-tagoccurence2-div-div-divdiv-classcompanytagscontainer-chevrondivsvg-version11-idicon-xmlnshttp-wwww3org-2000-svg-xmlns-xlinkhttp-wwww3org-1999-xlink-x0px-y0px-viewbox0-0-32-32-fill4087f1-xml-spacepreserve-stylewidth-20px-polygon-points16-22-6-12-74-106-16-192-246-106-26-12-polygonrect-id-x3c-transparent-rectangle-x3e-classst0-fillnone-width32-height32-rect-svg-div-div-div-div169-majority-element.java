class Solution {
    public int majorityElement(int[] nums) {
        
        // frequency count using hashmap 
        
        HashMap<Integer,Integer> map = new HashMap<>();
        int n=nums.length;
        int ele = 0 ;
        for(int i=0 ; i<n ; i++)
        {
          map.put(nums[i], map.getOrDefault(nums[i],0)+1 );  
            if(map.get(nums[i])>n/2)
            {
                ele = nums[i];
                break;
            }
        }
        
        return ele;
        
       
    }
}
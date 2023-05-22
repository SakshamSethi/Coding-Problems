class Solution {
    public int majorityElement(int[] nums) {
        
        // Brute Force : O(N^2) 
        // Better : can use a hashMap for storing frequencies TC: O(n) SC:almost O(n)
        
        //Optimal Solution?
        // Moore's Voting Algo
        
        int ele = nums[0];
        int count = 1;
        for(int i =1 ;i<nums.length;i++)
        {
            
            if(ele == nums[i]) count ++;
            else count --;
            
            if(count == 0)
            {    ele = nums[i];
                count =1;
            }
            
        }
        return ele;
    
    }
}
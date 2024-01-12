class Solution {
    public List<Integer> majorityElement(int[] nums) {
     
        int count1 = 0;
        int count2 = 0;
        
        int element1 = Integer.MIN_VALUE;
        int element2 = Integer.MAX_VALUE;
        
        int n = nums.length;
        
        for(int i=0 ; i<n ; i++)
        {
            if(count1==0 && nums[i]!=element2)
                element1=nums[i];
            
            if(count2==0 && nums[i]!=element1)
                element2=nums[i];
            
            if(element1 == nums[i]) count1++;
            else if (element2==nums[i]) count2++;
            else
            {
                count1--;
                count2--;
            }
        }
        
        // verify 
        
        count1=0; count2=0;
        
        int freq = n/3;
        List<Integer> ans = new ArrayList<>();
        
        for(int element : nums)
        {
            if(element == element1)count1++;
            if(element==element2)count2++;
        }
        
        if(count1>freq) ans.add(element1);
        if(count2>freq) ans.add(element2);
        return ans;
        
    }
}
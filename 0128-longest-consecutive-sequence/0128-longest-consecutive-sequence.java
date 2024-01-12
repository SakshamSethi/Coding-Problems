class Solution {
    public int longestConsecutive(int[] nums) {
        
        HashSet<Integer> hs = new HashSet();
        
        for(int ele : nums) hs.add(ele);
        
        
        int longest = 0 ;
        
        for(int ele : nums)
        {
            
            if(!hs.contains(ele-1))
            {
                int currentNum = ele ;
                int currCount = 1;
                while(hs.contains(currentNum+1))
                {
                    currentNum ++;
                    currCount++;
                }
                longest = Math.max(longest , currCount);
            }
            
        }
        return longest;
    }
}
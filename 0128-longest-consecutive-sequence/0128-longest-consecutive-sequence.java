class Solution {
    public int longestConsecutive(int[] nums) {
        
        if(nums.length==0) return 0;
        Set<Integer> hs = new HashSet();
        
        for(int n: nums)
        { hs.add(n); }
        
        int longest = 1;
        int cn=0;
        int cs=0;
        for(int n: nums)
        {

            if(!hs.contains(n-1))
            { cn = n;
              cs = 1;
                while(hs.contains(cn+1))
                {
                    cn++;
                    cs++;
                }
             longest = Math.max(longest,cs);
            }
            
        }
        return longest;
    }
}
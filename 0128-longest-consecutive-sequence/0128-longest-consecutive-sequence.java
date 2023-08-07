class Solution {
    public int longestConsecutive(int[] nums) {
     
    // Wihtout using extra space :
      /*if(nums.length==0)return 0;
      
      Arrays.sort(nums);
      
      int longest =  1;
      int count= 0;
      int lastSmaller = Integer.MIN_VALUE ;
      
      for(int ele : nums)
      {
        if(ele-1 == lastSmaller)
        {
          count++;
          lastSmaller = ele ;
        }
        
        else if(ele == lastSmaller) continue ;
        
        else 
        {
          count = 1 ;
          lastSmaller = ele ;
        }
        
        longest = Math.max(longest , count );
        
      }
      
      return longest; */
      
      
      
      // using extra space for a set ;
      
      if(nums.length==0)
        return 0;
      
      
      
      LinkedHashSet<Integer> set = new LinkedHashSet<>();
      
      for(int num : nums) set.add(num);
      
      int longest = 1;
      
      for(int num:nums )
      {
        if(!set.contains(num-1))
        {
          int currNumber = num ;
          int currCount = 1;
          while(set.contains(currNumber+1))
          {
            currNumber++ ;
            currCount++;
          }
        longest = Math.max(longest , currCount);   
        }

      }
      
      
      return longest;
      
      
    }
}
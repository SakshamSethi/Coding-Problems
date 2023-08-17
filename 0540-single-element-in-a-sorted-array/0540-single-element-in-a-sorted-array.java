class Solution {
    public int singleNonDuplicate(int[] nums) {
        
       int n = 0;
      
      for(int ele : nums) n=n^ele;
      return n;
    }
}
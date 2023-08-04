class Solution {
    public boolean canJump(int[] nums) {
      
      int reachable =0;
      int n= nums.length;
      if(nums[0]==0 && n>1)return false ;
      
      for(int i=0 ; i<n  ; i++)
      {
        if(i>reachable)return false ;
        
        else{
          
          reachable = Math.max(reachable , i+nums[i]);
        }
      }
      return true;
    }
}
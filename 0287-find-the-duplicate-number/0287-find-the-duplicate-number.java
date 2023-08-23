class Solution {
    public int findDuplicate(int[] nums) {
     
      // easy brute force 
      
/*      Arrays.sort(nums);
      
      for(int i=0 ; i<nums.length-1;i++)
        if(nums[i]==nums[i+1]) return nums[i];
      
      return -1; */
      
      // without modifying and constant space : we can use  double for loop 
      // brute force without modifying!
  
      /* TLE 
      int n = nums.length;
      for(int i=0 ; i<n ; i++)
      {
        for(int j=0; j<n ; j++)
        {
          if(i==j)continue;
          if(nums[i]==nums[j]) return nums[i];
        }
      }
      
      return -1;
      */
      
      // can also do map stuff to store frequency but we dont have to use extra space !
      
      // using slow and fast pointer approach 
      
      int n = nums.length;
      int slow = 0 ;
      int fast = 0 ;
        
      do
      {
        slow = nums[slow];
        fast = nums[nums[fast]];
        
      }while(slow!=fast);
      
      
      int slow2=0;
      
      while(slow2!=slow)
      {
        slow = nums[slow];
        slow2=nums[slow2];
      }
      
      return slow;
      
    }
}
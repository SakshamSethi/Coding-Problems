class Solution {
    public void rotate(int[] nums, int k) {
      
      int n = nums.length;
   // k should not exceed the range of array
      int point = (n-k%n) ;
   
      reverse(nums,0,point-1);
      reverse(nums , point , n-1);
      reverse(nums ,0,n-1);
      
      
      
      
    }
  
  void reverse(int[] nums , int start , int end)
  {
    while(start<end)
    {
      int temp = nums[start];
      nums[start] = nums[end];
      nums[end] = temp ;
      
      start++; 
      end--;
    }
  }
}
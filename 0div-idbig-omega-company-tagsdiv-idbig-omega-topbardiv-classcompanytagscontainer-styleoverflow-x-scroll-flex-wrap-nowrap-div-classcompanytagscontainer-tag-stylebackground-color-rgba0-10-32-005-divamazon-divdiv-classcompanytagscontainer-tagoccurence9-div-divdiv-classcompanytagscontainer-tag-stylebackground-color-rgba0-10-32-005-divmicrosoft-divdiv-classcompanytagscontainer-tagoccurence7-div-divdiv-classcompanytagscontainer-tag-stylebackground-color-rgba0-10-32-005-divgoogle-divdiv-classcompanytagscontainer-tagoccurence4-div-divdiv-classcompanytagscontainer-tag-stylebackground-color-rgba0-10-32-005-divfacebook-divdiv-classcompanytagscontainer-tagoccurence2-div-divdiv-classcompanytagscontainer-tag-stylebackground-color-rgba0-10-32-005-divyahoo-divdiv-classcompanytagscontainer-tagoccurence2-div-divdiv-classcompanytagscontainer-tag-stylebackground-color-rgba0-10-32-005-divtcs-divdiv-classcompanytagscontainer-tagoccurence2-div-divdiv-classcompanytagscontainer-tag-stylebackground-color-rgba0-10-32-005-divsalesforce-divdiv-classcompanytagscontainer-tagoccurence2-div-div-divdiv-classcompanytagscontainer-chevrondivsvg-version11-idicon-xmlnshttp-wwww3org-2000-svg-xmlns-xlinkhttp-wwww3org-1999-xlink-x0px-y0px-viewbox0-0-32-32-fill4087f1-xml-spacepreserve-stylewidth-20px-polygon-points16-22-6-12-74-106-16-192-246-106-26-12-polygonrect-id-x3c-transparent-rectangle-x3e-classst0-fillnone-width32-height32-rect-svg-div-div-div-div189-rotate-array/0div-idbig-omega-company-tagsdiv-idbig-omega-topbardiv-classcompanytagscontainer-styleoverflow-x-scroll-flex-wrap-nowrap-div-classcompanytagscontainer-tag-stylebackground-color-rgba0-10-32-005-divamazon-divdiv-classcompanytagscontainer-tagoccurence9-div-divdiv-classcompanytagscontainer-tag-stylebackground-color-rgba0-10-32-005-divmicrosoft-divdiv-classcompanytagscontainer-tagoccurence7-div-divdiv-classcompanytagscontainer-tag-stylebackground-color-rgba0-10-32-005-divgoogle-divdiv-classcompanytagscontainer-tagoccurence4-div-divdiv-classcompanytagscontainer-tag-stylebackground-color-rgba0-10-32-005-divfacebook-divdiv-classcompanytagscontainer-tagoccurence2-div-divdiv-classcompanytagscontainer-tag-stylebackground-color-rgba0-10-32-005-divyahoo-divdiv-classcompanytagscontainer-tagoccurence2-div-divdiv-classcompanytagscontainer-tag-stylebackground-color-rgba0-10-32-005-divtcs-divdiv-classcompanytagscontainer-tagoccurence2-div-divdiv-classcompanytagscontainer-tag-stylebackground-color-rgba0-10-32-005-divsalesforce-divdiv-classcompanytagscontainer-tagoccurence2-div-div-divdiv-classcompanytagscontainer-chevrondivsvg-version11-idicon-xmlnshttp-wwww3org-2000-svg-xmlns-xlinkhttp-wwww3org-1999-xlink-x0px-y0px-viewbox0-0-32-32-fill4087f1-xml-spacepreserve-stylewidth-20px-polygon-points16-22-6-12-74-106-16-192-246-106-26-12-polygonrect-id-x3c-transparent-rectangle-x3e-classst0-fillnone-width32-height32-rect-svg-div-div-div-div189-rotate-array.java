class Solution {
    public void rotate(int[] nums, int k) {
  
        int n=nums.length-1;
        k=k%(n+1);
        reverse(nums,0,n-k);
        reverse(nums,n-k+1,n);
        reverse(nums,0,n);
        
      
        
    }
    
    void reverse(int[] nums , int start , int end)
    {
        while(start<=end)
        {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }
    
}
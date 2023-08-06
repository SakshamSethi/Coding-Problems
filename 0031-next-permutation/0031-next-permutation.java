class Solution {
    public void nextPermutation(int[] nums) {
     
      int ind = -1 ;
      int n = nums.length;
      
      for(int i = n-2 ; i>=0 ; i-- )
      {
        
        if(nums[i]<nums[i+1])
        {
          ind = i ;
          break ;
        }
        
      }
      
      if(ind == -1)
      {
        reverse(nums,0,n-1);
      return;
      }
      
      // step - 2 :
      
      for(int i = n-1 ; i>=ind ; i--)
      {
        if(nums[ind]<nums[i])
        {
          int temp = nums[ind];
          nums[ind] = nums[i];
          nums[i]=temp;
          break ;
        }
      }
      
      reverse(nums,ind+1,n-1);
      return ;
      
      
    }
  
  void reverse(int[]nums , int start , int end)
  {
    int temp =0 ;
    while(start<end)
    {
      temp = nums[start];
      nums[start]=nums[end];
      nums[end]=temp;
      start++;
      end--;
    }
  }
  
  
}
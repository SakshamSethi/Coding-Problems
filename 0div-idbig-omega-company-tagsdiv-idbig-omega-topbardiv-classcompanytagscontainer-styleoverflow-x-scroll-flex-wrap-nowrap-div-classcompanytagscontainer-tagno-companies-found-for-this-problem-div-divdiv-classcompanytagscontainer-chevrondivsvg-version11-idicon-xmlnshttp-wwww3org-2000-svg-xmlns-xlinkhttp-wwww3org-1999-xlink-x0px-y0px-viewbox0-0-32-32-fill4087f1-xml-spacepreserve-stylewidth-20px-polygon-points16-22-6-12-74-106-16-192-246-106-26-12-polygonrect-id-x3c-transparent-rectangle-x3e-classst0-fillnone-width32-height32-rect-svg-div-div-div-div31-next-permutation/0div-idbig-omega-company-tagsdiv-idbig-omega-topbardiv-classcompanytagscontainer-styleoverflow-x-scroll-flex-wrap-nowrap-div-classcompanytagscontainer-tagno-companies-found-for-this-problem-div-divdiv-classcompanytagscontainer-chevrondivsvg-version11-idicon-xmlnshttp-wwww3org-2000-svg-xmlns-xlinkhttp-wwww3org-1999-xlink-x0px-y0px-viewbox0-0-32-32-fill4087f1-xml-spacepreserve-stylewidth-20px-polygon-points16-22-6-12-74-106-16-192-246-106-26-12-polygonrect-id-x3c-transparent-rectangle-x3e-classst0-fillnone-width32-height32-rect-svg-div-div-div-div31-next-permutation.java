class Solution {
    public void nextPermutation(int[] nums) {
        
        int index = -1 ;
        int n = nums.length;
        for(int i=n-2 ; i>=0 ; i--)
        {
            if(nums[i]<nums[i+1])
            {
                index = i;
                break;
            }
        }
     
        int min = Integer.MAX_VALUE;
        int miniIdx = n+1;
        if(index!=-1)
        {
             for(int i = n-1 ; i>=index ; i--)
      {
        if(nums[index]<nums[i])
        {
          int temp = nums[index];
          nums[index] = nums[i];
          nums[i]=temp;
          break ;
        }
      }
   
            reverse(nums,index+1,n-1);
        }
        else
        {
            reverse(nums,0,n-1);
        }
        
    }
    void reverse(int[]nums , int i , int j)
    {
        while(i<j)
        {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
}
class Solution {
    public void nextPermutation(int[] nums) {
        
        int index = -1;
        int n = nums.length;
        // 1 : find the breaking point 
        
        for(int i=n-2 ; i>=0 ; i--)
        {
            if(nums[i]<nums[i+1])
            {
                index = i;
                break;
            }
        }
        // check if -1 : if yes than this is the last permute so return its reverse as the first permute 
        
        if(index==-1)
        {
            reverse(nums,0,n-1);
            return ;
        }
        
        // step 2 : Replace with immediate greater from back
        
        for(int i=n-1 ; i>=index ; i--)
        {
            if(nums[i]>nums[index])
            {
                int temp = nums[i];
                nums[i] = nums[index];
                nums[index]=temp;
                break;
            }
        }
        
        // step 3 : reverse the rest 
        
        reverse(nums,index+1 , n-1);
        
    }
    
    private void reverse(int[]nums , int i , int j)
    {
     while(i<j)
     {
         int temp = nums[i];
         nums[i] = nums[j];
         nums[j]=temp;
         i++;
         j--;
     }
    }
}
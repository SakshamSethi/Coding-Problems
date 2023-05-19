class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        if(n<=1)return;
      int x=0;
        // reversing approach 
x = k%n;
    int a = 0;
        int b = n-1;
          while(a<=b)
       {
           swap(nums,a,b);
           a++;
           b--;
       }       
        
         a = x;
         b = n-1;

       while(a<b)
       {
           swap(nums,a,b);
           a++;
           b--;
       }
        a = 0;
        b = x-1;
          while(a<b)
       {
           swap(nums,a,b);
           a++;
           b--;
       }
    
    }
    void swap(int[] nums , int a, int b)
    {
        int temp = nums[a];
           nums[a] = nums[b];
           nums[b] = temp;
        return;
    }
}
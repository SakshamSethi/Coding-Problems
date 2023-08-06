class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
      int[]pos = new int[n/2];
      int[]neg = new int[n/2];
      int p=0 ; int j=0;
      for(int ele : nums)
      {
        if(ele<0) neg[j++] = ele;
        else pos[p++] = ele;
        
      }
      
      int k=0;
      
      for(int i=0 ; i<n/2 ; i++)
      {
        nums[k++] = pos[i];
        nums[k++] =neg[i];
      }
      return nums;
    }
}
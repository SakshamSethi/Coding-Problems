class Solution {
    public int[] rearrangeArray(int[] nums) {
        
        // Brute force approach 
        // store 2 arrays : 1 for +ve  1 for -ve 
        //  TC O(N)+O(N) SC: O(N)
        
    //Better ?
    // using 2 pointers for postion checking
        
        int pos =0;
        int neg =1;
        int n = nums.length;
        int[] res = new int[n];
        for(int i=0 ;i<n;i++)
        {
            if(nums[i]>0)
            {
            res[pos] = nums[i];
                pos+=2;
            }
            else
            {
                res[neg]=nums[i];
                neg+=2;
            }
        }
    return res;
    }
}
class Solution {
    public int maximumProduct(int[] nums) {
        
        Arrays.sort(nums);
        int n = nums.length;
        int proPos = nums[n-1]*nums[n-2]*nums[n-3];
        int proNeg = nums[0]*nums[1]*nums[n-1];
        
        return (int)(Math.max(proPos,proNeg));
    }
}
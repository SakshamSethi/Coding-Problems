class Solution {
    public int missingNumber(int[] nums) {
/*int n = nums.length;
        int sum = ((n) *(n+1))/2 ;
        for(int x : nums)
        {
            sum -=x;
        }
        return sum;
 */
        // XOR solution
        int n = nums.length;
        int xor1 = n;
        int xor2 = 0;
        
        for(int i=0;i<n;i++)
        {
            xor1 ^= i;
            xor2 ^= nums[i];
            
        }
        return xor1^xor2;
 }
}
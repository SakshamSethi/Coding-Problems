public class Solution {
 public int singleNumber(int[] nums) {
    int[] digit = new int[32];
    for(int i = 0; i < 32; i++){
       
        for (int j = 0; j < nums.length; j++){
            digit[i]+= (nums[j]>>i)&1; 
        }
    }
    int res = 0;
    for (int i =0; i< 32; i++){
       
        int d = digit[i]%3 ==0 ? 0: 1;
        res += (d)<<i;
    }
    return res;
}
}
class Solution {
   public int minAbsoluteSumDiff(int[] nums1, int[] nums2) {
        
    int len = nums1.length, mod = 1_000_000_007;
    int[] diff = new int[len];
    long sum = 0, ans = 0;
    
    for(int i = 0 ; i < len ; i++){
        diff[i] = Math.abs(nums1[i] - nums2[i]);
        sum += diff[i];
    }
    
    ans = sum;
    Arrays.sort(nums1);
    
    for(int i = 0 ; i < len ; i++){
        sum -= diff[i];            
        int val = bestMatch(nums1, nums2[i]);
        sum += val;
        
        if(sum < ans)
            ans = sum;
        sum -= val;
        sum += diff[i];
    }
    
    return (int) (ans % mod);
}

public int bestMatch(int[] nums, int target){
    
    int lo = 0, hi = nums.length - 1, small = -1, big = -1, ans = Integer.MAX_VALUE;
    while(lo <= hi){
        
        int mid = lo + (hi - lo) / 2;
        if(nums[mid] == target)
            return 0;
        else if(nums[mid] < target){
            lo = mid + 1;
            small = mid;
        }
        else{
            hi = mid - 1;
            big = mid;
        }
    }
    
    if(small != -1)
        ans = Math.abs(target - nums[small]);
    
    if(big != -1)
        ans = Math.min(ans, Math.abs(target - nums[big]));
    
    return ans;
}
    
}
class Solution {
    public boolean find132pattern(int[] nums) {
   
        // Brute Force
        
        /*for (int i = 0; i < nums.length; i++) {
        for (int j = i + 1; j < nums.length; j++) {
            for (int k = j + 1; k < nums.length; k++) {
                if (nums[i] < nums[k] && nums[k] < nums[j]) return true;
            }
        }
    }
    return false; */
        
        Stack<Integer>st = new Stack();
        int th= Integer.MIN_VALUE;
        for(int i = nums.length-1 ;i>=0;i--)
        {
            if(nums[i]<th) return true;
            
            while(!st.isEmpty() && st.peek()< nums[i])
            {
                th = st.pop();
                
            }
               st.push(nums[i]);
        }
     

    return false;
}
}
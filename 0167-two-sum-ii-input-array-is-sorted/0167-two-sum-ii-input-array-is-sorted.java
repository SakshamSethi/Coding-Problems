class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int s =0 , e = numbers.length-1;
        int ans[] = new int[2];

        while(s<=e)
        {
           
            if(target==numbers[s]+numbers[e])
            {
                ans[0]=s+1;
                ans[1]=e+1;
                return ans;
            }
            else if(target<numbers[s]+numbers[e])
            {
                e--;
            }
            else
            {s++;
            }
        }
        return ans;
    }
}
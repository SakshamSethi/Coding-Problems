class Solution {
    public List<Integer> largestDivisibleSubset(int[] arr) {
      
      int x = arr.length;
       int[]dp = new int[x];
        int[] hash = new int[x];
 Arrays.sort(arr);
        int max=0;
        Arrays.fill(dp,1);
        int last_index = 0 ; 
        for(int i=0 ; i<x;i++ )
            {   hash[i]=i;
                for(int prev=0 ; prev<i ; prev++)
                {
                    if(arr[i]%arr[prev]==0 && dp[i]<1+dp[prev])
                    {
                        dp[i]=1+dp[prev];
                        hash[i] = prev;
                    }
                }
                if(max<dp[i])
                {
                    max =dp[i];
                    last_index=i;
                }
            }
            List<Integer> ans = new ArrayList<>();
            ans.add(arr[last_index]);
            int idx = hash[last_index];
        while(max>1)
        {
                ans.add(arr[idx]);
                idx=hash[idx];
                max--;

        }


return ans;
    }
}
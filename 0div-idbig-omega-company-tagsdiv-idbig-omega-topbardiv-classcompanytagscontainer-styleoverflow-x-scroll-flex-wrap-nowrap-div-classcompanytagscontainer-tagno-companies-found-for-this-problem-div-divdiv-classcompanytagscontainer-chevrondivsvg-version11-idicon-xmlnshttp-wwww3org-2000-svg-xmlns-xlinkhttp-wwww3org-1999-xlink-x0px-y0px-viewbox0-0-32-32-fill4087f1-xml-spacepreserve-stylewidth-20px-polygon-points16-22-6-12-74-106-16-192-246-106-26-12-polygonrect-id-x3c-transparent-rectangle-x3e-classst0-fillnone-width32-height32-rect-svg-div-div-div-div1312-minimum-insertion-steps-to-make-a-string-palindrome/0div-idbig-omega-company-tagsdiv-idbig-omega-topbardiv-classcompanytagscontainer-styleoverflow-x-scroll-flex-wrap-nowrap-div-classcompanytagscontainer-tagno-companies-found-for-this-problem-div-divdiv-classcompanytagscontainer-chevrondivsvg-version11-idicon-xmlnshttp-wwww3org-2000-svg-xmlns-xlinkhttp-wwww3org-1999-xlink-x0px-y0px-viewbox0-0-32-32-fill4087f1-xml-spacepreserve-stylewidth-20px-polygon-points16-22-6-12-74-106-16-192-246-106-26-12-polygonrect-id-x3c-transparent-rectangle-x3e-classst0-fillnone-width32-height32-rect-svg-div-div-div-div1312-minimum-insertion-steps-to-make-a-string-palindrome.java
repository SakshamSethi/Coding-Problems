class Solution {
    public int minInsertions(String s) {
        
        // find out longest common palindrome and subtract it from the total length
        
        String reverse =  new StringBuilder(s).reverse().toString();
        
        int n = s.length();
        int[][]dp = new int[n][n];
        for(int[]row : dp )Arrays.fill(row,-1);
        
        return n-match(s,reverse,n-1,n-1,dp);

    }
    int match(String s1 , String s2 , int i , int j , int[][]dp)
    {
        if(i<0||j<0)return 0;
        if(dp[i][j]!=-1)return dp[i][j];
        
        if(s1.charAt(i)==s2.charAt(j))
            return dp[i][j]=1+match(s1,s2,i-1,j-1,dp);
        else
            return dp[i][j]= Math.max(match(s1,s2,i,j-1,dp),match(s1,s2,i-1,j,dp));
    }
}
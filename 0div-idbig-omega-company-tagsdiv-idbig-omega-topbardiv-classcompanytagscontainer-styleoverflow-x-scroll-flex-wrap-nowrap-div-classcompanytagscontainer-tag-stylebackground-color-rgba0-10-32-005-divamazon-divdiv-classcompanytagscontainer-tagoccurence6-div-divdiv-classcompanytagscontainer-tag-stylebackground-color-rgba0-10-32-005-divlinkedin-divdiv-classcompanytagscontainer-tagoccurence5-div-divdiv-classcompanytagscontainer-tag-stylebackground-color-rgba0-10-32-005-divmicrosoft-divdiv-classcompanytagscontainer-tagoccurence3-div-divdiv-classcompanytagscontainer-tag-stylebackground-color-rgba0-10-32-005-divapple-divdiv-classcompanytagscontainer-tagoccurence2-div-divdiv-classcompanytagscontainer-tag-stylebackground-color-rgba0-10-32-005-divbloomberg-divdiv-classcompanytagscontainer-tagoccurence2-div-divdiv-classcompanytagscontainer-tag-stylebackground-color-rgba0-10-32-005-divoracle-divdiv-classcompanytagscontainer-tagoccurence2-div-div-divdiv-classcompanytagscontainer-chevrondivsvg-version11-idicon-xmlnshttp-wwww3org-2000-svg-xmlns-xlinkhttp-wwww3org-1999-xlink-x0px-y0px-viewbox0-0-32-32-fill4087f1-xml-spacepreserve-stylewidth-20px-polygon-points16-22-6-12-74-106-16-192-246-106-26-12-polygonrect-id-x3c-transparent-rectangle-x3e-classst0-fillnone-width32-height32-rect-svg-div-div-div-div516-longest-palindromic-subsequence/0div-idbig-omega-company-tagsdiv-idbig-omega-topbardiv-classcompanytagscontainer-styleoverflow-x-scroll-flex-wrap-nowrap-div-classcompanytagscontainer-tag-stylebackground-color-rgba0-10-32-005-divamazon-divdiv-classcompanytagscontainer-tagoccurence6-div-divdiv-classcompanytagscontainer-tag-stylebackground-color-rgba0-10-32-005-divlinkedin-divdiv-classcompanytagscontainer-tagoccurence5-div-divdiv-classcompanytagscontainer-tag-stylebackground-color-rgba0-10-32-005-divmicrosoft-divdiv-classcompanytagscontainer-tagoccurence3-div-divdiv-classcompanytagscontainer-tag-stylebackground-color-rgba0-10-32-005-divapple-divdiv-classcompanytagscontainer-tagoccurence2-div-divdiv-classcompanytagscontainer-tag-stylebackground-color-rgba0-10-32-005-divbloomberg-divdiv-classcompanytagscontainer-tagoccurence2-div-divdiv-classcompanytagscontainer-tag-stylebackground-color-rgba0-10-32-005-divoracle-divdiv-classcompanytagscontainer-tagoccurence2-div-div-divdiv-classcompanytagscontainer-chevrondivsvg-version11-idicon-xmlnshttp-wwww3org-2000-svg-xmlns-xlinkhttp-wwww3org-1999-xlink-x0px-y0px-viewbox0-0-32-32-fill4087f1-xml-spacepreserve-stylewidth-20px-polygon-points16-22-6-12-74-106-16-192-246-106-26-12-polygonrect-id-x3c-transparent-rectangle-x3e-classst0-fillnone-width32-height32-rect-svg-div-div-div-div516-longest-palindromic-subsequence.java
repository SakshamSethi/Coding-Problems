class Solution {
    public int longestPalindromeSubseq(String s) {
       
        int n=s.length();
        int[][]dp = new int[n][n];
        for(int[]row:dp)Arrays.fill(row,-1);
        String reverse = new StringBuilder(s).reverse().toString();
        return  match(s,reverse,0,0,dp);
    }
    
    int match(String s1 , String s2 , int i , int j , int[][]dp)
    {
        if(i==s1.length()) return 0;
        if(j==s2.length()) return 0;
        
        
        if(dp[i][j]!=-1)return dp[i][j];
        
        int matched = 0;
        
        if(s1.charAt(i)==s2.charAt(j))
            matched = 1+match(s1,s2,i+1,j+1,dp);
        
        int unmatched = Math.max(match(s1,s2,i+1,j,dp),match(s1,s2,i,j+1,dp));
        
        return dp[i][j] = Math.max(matched , unmatched);
        
        
    }
}
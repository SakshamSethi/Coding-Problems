class Solution {
    public int minDistance(String word1, String word2) {
        
// find out lcs and then find out extra characters in both the strings , these number of extra characters are your answer !

        int n = word1.length();
        int m = word2.length();
        int[][]dp=new int[n][m];
        
        for(int[]row:dp)Arrays.fill(row,-1);
        
        int lcsLen = lcs(word1,word2,n-1,m-1,dp);
        return n-lcsLen+m-lcsLen ;
        
    }

    int lcs(String s1 , String s2 , int n , int m ,int[][]dp)
    {
        if(n<0||m<0)return 0;
        if(dp[n][m]!=-1)return dp[n][m];
        
        if(s1.charAt(n)==s2.charAt(m))
            return dp[n][m]= 1+lcs(s1,s2,n-1,m-1,dp);
        else
            return dp[n][m]= Math.max(lcs(s1,s2,n-1,m,dp),lcs(s1,s2,n,m-1,dp));
    }
}

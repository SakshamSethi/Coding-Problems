class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        
         int[][]dp = new int[text1.length()][text2.length()];
        for(int[]arr:dp)Arrays.fill(arr,-1);
        return count(text1 , text2 , 0, 0,dp);
        
    }
    
    int count(String s1 , String s2 , int i , int j,int[][]dp)
    {
        if(j==s2.length())return 0;
        if(i==s1.length())return 0;
        
        if(dp[i][j]!=-1)return dp[i][j];
        
        int matched=0;
        
        if(s1.charAt(i)==s2.charAt(j))
            matched = 1+count(s1,s2,i+1,j+1,dp);
        
            int notMatched = 0;
        if(s1.charAt(i)!=s2.charAt(j))
            notMatched = Math.max(count(s1,s2,i+1,j,dp),count(s1,s2,i,j+1,dp) ); 
        
            
        return dp[i][j]=Math.max(matched,notMatched);
            
     }
}
class Solution {
    public String mergeAlternately(String word1, String word2) {
    
        String ans = new String("");
        int i=0; int n= word1.length(),n2=word2.length();
        int j=0;
        while(i<n || j<n2)
        {
            
            if(i<n){
            ans+=word1.charAt(i); i++;}
            
            if(j<n2){
            ans+=word2.charAt(j);
            
            j++;
        }
        }
       
       return ans; 
    }
}
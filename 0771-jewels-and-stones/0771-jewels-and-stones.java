class Solution {
    public int numJewelsInStones(String jewels, String stones) {
    int ans=0; 
        int i=0; 
        while(i<stones.length())
        {
            if(jewels.indexOf(stones.charAt(i))!=-1 )
                ans++;
            i++;
        }
    return ans; 
    }
}
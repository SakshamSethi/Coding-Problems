class Solution {
    public int largestAltitude(int[] gain) {
        
        int heighest = 0;
        int point=0;
        for(int i=0 ;i<gain.length;i++)
        {
            point+=gain[i];
            heighest=Math.max(heighest,point);
        }
        return heighest;
    }
}
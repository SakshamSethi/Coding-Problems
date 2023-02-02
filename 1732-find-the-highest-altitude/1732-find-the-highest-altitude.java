class Solution {
    public int largestAltitude(int[] gain) {
        int max=0; int n=0;
        for(int i=0 ; i<gain.length;i++)
        {
            n +=gain[i];
            max = Math.max(max ,n);
        }
        return max;
    }
}
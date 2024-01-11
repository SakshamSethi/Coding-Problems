class Solution {
    public int minCostToMoveChips(int[] position) {
        
        int evenSum =0;
        int oddSum =0;
        
        for(int ele : position)
        {
            if(ele%2==0) evenSum++;
            else oddSum++;
        }
        return Math.min(evenSum , oddSum);
    }
}
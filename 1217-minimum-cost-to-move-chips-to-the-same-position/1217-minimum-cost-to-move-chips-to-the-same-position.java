class Solution {
    public int minCostToMoveChips(int[] position) {
      
    // odd even ka sum 
      
      int oddCount=0 , evenCount =0;
      
      for(int ele : position)
      {
        if(ele%2==0) evenCount++;
        else oddCount++;
      }
        return Math.min(evenCount , oddCount);
    }
}
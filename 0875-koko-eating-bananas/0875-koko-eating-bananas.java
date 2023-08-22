class Solution {
    public int minEatingSpeed(int[] piles, int h) {
    
      long lowerBound = 1;
      long upperBound = (long)1e9;
      
      long k = 0;
      
      while(lowerBound<=upperBound)
      {
          
        long mid = lowerBound + (upperBound-lowerBound)/2;
        
        if(canEatBananas(piles,mid,h))
        {
          k = mid ;
         upperBound = mid-1;
        }
        else
        {
          lowerBound=mid+1;
        }
        
        
      }
      
      return (int)k;
    }
  
  boolean canEatBananas(int[]piles,long k , int h)
  {
  long hoursTaken = 0;
    
    for(int pile : piles)
    {
      
      long div = (long)pile/k;
      
      hoursTaken+=div;
      
      if(pile%k!=0)hoursTaken++;
      
    }
    return hoursTaken<=h;
    
  }
  
}
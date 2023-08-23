class Solution {
    public int shipWithinDays(int[] weights, int days) {
     
      
      // from the given question we can conclude that 
      
      // the minimum capacity of the ship should be atleast that much  that it can load the maxmimum wieght package , so the minimum capacity that the ship must have should be the maximum weight element 
      
      // And in the worst case the ship should have the capacity of sum of all the elements as if the no of days we have is only 1 then we would have to ship all the packages at one go 
      
  // so we can use the binary search to check if the capacity which we will dervive using mid formulae can this be the capacity which would be able to ship all the packages on time 
      
      // and we will make changes to the min and max (low and high) accordingly !
      
      
      
      int minCapacity = 0;
      int maxCapacity = 0;
      
      for(int weight : weights)
      {
        minCapacity = Math.max(minCapacity , weight);
        maxCapacity += weight;
      }
      
      // now we can apply binary search approach (lowerBound and UpperBound) to find out the minimum capacity the ship should have 
      
      
      int ans = 0;
      
      while(minCapacity<=maxCapacity)
      {
        int curCapacity = minCapacity + (maxCapacity-minCapacity)/2;
        
        // check if the current capacity is capable of transferring all the packages with in the D days given 
        
        
        if(canShip(weights,days,curCapacity))
        {
          ans = curCapacity ;
          maxCapacity = curCapacity-1;
        }
        else
        {
          minCapacity=curCapacity+1;
        }
        
        
      }
      
      return ans;
      
    }
  
  boolean canShip(int[]weights , int days,int capacity)
  {
    // i have to check that weather we can ship withint he limited days
  
  
    int daysRequired = 1; 
    int sum = 0;    
    for(int i = 0 ; i<weights.length ; i++)
    {
      sum+=weights[i];
      
      if(sum>capacity)
      {
        daysRequired++;
        sum = weights[i];
        
      }
 
    }
     
      return daysRequired<=days;
  }
  
  
  
}
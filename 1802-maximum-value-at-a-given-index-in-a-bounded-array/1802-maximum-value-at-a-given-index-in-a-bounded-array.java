class Solution {
    public int maxValue(int n, int index, int maxSum) {
        
      // binary search logic :
      
 /*
 what we have to do is , we have to find the maximum possible element at the given index 
 
 */     
  
      
      int emptyRightElements = n-index-1;
      int emptyLeftElements = index ;
      
      
      // create a range of minimum and maximum ele you could have at the index
      
      
      int lowerBound = 1;
      int upperBound = maxSum ;
      
      
      int result = 0;
      
      while(lowerBound<=upperBound)
      {
        int mid = lowerBound + (upperBound-lowerBound)/2;
        
        long totalSum = 0;
        long element = mid-1;
        long rightSum =0 , leftSum=0;
        
        if(element>=emptyRightElements)
        {
          // i have to calculate the sum of RHS as
          
          rightSum = (element*(element+1)/2) -  ( (element-emptyRightElements)*(element-emptyRightElements+1)/2);
          
          
        }
        else
        {
           rightSum = (element*(element+1)/2) + (emptyRightElements-element); 
        }
        
        
        // similarly can do the same for the LHS elements
        
          if(element>=emptyLeftElements)
        {
          // i have to calculate the sum of LHS as
          
          leftSum =  (element*(element+1)/2) -  ( (element-emptyLeftElements)*(element-emptyLeftElements+1)/2);
          
          
        }
        else
        {
           leftSum = (element*(element+1)/2) + (emptyLeftElements-element); 
        }
        
        totalSum = leftSum+rightSum+mid;
        
        if(totalSum<=maxSum)
      {
        result = mid ;
        lowerBound = mid+1;
      }
      else
      {
        upperBound = mid-1;
      }
        
      }
      
     return result ;
      
    }
}
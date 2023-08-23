class Solution {
    public int splitArray(int[] nums, int k) {
        
      
      // calculate the min and max possible largest sum of subarrays 
      
      // we can have atmost n spilts and atleast 1 split 
      // 1 spit --> ans for ques will be sum of all elements , max possible largest sum 
      // n splits --> ans for the question will be the largest element in the array , min possible largest sum
      
      
      int minAns = -1;
      int maxAns = 0;
      
      for(int num : nums)
      {
        minAns = Math.max(num,minAns);
        maxAns +=num;
      }
      
      // check for the pieces thing
      
      int potentialAns = 0;
      
      while(minAns<=maxAns)
      {
        int mid = minAns + (maxAns-minAns)/2;
        
        // check how many pieces will this sum split out array into 
        
        int pieces = 1;
        int sum = 0;
        for(int num : nums)
        {
          sum+=num;
          
          if(sum>mid) 
          {
            pieces++;
            sum = num;
          }
          
        }
        
        // if the pieces satisfy the question's input or not 
        
        if(pieces<=k)
        {
          potentialAns = mid ;
          maxAns = mid-1;
        }
        else
        {
          minAns = mid+1;
        }
        
        
      }
      return potentialAns;
    }
}
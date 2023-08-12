class Solution {
    public int nextGreaterElement(int n) {
        
      
      // 1st step 
      
      int i=0 , j=0;
      char[]numbers = Integer.toString(n).toCharArray();
      
       
      
      for(i = numbers.length-1 ; i>0 ; i--)
      {
        if(numbers[i-1]<numbers[i]) break;
      }
      if(i==0) return -1;
      
      // search the right side of the numbers from the i-1 th digit onwards :
      // find out the smallest element which is greater than the i-1th digit :)
      
      int breakPoint = numbers[i-1];
      int currentSmallest = i ;
      
      for(j=i+1 ; j<numbers.length ; j++)
      {
        if(numbers[j]>breakPoint && numbers[currentSmallest]>=numbers[j])
        {
          currentSmallest = j ;
        }
      }
    
      // swap the breakPoint and currentSmallest 
      
       char temp = numbers[currentSmallest];
       numbers[currentSmallest] = numbers[i-1];
       numbers[i-1] = temp ;
      
      // now sort the array ahead of the breakPoint
      
      Arrays.sort(numbers , i, numbers.length);
      
      // return the answer 
      // we have to check if the answer is a valid answer or not ;
      
      long ans = Long.parseLong(new String(numbers));
      
       if(ans<=Integer.MAX_VALUE) return (int) ans ;
      
        return -1;
      
    }
}
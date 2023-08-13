class Solution {
    public int findMinDifference(List<String> timePoints) {
      
      //  will be converting all the times to their respective total minutes 
      
      
  boolean[] visited = new boolean[24*60];
      
      for(String time : timePoints)
      {
        int h = Integer.valueOf(time.substring(0,2));
        int m = Integer.valueOf(time.substring(3,5));
        
        int mins = h*60+m;
        
        if(visited[mins]) return 0;
        
        visited[mins]=true;
        
      }
      
      
      //find out the first time point 
      
      int index = 0;
      
      while(!visited[index]) index++; 
      
      int first = index;
      
      index = 1439;
      
      // finding the last time point 
      while(!visited[index]) index--;
      
      int last = index;
    
      // now have to calculate the minimal time difference !
      
      int mini = Integer.MAX_VALUE;
      int prev = first ;
      
      for(int i=first+1 ; i<=last ; i++ )
      {
        
        // check firt : if the index value is true or not ( we are given that point in the ques/not)
        
        if(visited[i])
        {
              mini = Math.min(mini , i-prev);
              prev = i;
          
        }
    
      }
    
      /*
      I have to check the time differece between first and last value as well.
      as clock follows 24 hrs cycle :
      
      first find out the difference b/w the given time point (last given time point) and 
      the end of the day !
      
      lastPoint ------>00:00 (12am )-------> firstPoint (of new Day)
      _____________________________          _______________________          
       This will be calucated as:
       1440 - lastPoint in mins             for this we will add the first point of new day 
      
      
      
      */
      
      
      return Math.min(mini ,(1440-last)+first );
      
    }
}
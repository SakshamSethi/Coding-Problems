class Solution {
    public int maximumPopulation(int[][] logs) {
         
        int[] arr = new int[101];
        
        for(int[] log : logs)
        {
            arr[log[0]-1950]++;
            arr[log[1]-1950]--;
        }
        
        // indexed based count 
        
        int maxPop=arr[0]; 
        int maxYear=0;
        
        for(int i=1 ; i<101;i++)
        {
            arr[i] = arr[i]+arr[i-1];
            
            if(maxPop<arr[i])
            {
                maxPop=arr[i];
                maxYear=i;
            }
            
        }
            
        return maxYear+1950;
    }
}
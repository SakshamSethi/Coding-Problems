class Solution {
    public int maximumPopulation(int[][] logs) {
        // indexed based counting 
      
      int[] population = new int[101];
      
        for(int[] log : logs)
        {
          int birthYear = log[0]-1950;
          int deathYear = log[1]-1950;
          
          population[birthYear]++;
          population[deathYear]--;
          
        }
     int maxYear = 0; int max =population[0];
      
      for(int i=1 ; i<101 ; i++ )
      {  population[i] += population[i-1]; 
        
        if(max < population[i])
        {
          max = population[i];
          maxYear=i;
        }
      }
      
      return maxYear+1950;
    }
}
class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int s = 0;
        int e = 0;
        
        for(int x: weights)
        {
            s = Math.max(s,x);
            e +=x;
        }
        
        int ans=0;
        int sum=0,d=0;
        while(s<e)
        {
            int  m = s + (e-s)/2;
             sum=0;
             d=1;
                  for(int x: weights)
                    {                   
                if((sum+x)>m)
                    
                {
                    d++;
                    sum=0;
                    
                }
                      sum+=x;
                    }
                
            
            
            
            if(d>days)
            {
                
                s=m+1;
            }
            else {
                
               e=m;
            }
            
        }
        return s;
        
    }
    
   
}
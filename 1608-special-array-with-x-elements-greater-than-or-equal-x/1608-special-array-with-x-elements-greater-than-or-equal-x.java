class Solution {
    public int specialArray(int[] nums) {
        
        int n=nums.length;
             int x=1;
        for(int i=0;i<n;i++)
        {
   
            int count=0;
            
                for(int j=0;j<n;j++)
                {
                  
                    if(x<=nums[j])
                    {
                        count++;
                    }
                }
                if(count==x)
                {
                    return x;
                }
            x++;
        }
        
        return -1;
    }
}
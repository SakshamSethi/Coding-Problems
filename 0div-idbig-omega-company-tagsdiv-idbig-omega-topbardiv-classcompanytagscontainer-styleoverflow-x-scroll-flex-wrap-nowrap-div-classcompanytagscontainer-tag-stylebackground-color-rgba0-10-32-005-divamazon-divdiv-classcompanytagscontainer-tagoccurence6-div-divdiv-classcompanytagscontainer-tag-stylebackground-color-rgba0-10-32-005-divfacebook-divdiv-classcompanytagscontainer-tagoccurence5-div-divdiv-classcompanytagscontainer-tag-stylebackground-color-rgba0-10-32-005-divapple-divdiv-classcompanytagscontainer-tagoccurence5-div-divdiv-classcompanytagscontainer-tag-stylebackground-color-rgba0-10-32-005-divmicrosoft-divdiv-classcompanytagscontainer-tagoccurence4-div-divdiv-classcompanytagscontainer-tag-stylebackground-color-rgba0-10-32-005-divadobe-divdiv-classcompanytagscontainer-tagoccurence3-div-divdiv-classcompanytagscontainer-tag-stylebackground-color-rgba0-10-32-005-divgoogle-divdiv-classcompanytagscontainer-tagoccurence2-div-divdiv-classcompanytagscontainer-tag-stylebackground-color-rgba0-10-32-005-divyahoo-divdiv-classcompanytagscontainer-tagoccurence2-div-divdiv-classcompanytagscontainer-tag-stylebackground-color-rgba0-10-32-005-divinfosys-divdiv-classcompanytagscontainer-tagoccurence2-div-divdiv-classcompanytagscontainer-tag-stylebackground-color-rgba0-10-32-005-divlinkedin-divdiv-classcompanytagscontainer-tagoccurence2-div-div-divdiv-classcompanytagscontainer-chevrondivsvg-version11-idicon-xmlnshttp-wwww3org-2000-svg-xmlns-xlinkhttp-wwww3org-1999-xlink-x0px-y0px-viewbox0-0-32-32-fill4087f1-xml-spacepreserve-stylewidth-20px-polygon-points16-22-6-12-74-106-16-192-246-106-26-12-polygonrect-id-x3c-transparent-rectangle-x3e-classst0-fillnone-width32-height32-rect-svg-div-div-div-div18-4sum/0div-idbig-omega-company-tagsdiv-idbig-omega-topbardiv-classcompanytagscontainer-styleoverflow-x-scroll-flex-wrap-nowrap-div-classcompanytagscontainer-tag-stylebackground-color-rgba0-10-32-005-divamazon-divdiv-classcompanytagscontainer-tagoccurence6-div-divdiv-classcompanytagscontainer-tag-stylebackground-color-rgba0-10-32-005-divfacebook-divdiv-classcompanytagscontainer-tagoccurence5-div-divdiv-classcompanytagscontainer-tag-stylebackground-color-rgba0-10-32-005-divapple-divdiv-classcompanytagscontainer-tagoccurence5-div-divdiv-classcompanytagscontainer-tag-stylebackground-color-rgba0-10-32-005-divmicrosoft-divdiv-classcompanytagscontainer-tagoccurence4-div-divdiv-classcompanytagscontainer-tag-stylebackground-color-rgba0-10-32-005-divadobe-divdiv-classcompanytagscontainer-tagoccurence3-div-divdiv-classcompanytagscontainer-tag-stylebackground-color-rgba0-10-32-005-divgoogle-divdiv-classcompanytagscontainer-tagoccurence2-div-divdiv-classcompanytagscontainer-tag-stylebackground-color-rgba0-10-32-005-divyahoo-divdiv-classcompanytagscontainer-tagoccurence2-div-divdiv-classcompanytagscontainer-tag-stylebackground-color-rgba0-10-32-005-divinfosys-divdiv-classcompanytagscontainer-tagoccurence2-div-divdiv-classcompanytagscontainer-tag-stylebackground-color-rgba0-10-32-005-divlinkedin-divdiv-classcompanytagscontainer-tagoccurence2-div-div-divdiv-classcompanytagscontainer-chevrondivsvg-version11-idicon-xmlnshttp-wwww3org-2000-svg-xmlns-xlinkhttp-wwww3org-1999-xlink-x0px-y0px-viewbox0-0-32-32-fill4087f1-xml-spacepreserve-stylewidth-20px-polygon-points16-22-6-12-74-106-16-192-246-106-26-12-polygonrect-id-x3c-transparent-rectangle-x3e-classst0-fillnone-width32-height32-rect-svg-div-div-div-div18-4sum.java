class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        
        Arrays.sort(nums);
        int n = nums.length;
        List<List<Integer>>ans = new ArrayList();
        for(int i=0 ; i< n ; i++ )
        {
            if(i>0 && nums[i]==nums[i-1])continue;

            for(int j=i+1 ; j<n ; j++)
            {
                if(j>i+1 && nums[j]==nums[j-1])continue;
                
                    int k = j+1;
                    int x = n-1;
                
                while(k<x)
                {
                
                     long sum = nums[i];
              sum+=nums[j];
            sum+=nums[k];
            sum+=nums[x];
                    
                    
                    if(sum>target)
                    {
                        x--;
                    }
                    else if(sum<target) k++;
                    
                    
                    if(sum==target)
                    {
                        List<Integer> temp = Arrays.asList(nums[i],nums[j],nums[k],nums[x]); 
                        
                        ans.add(new ArrayList(temp));
                        
                        k++;
                        x--;
                        
                        while(k<x && nums[k]==nums[k-1]) k++;
                        while(k<x && nums[x]==nums[x+1]) x--;
                    }
                    
                }
                
                
            }
            
        }
        return ans;
    }
}
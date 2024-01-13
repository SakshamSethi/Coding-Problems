class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
      /*
      Brute Force :
        
        HashSet<List<Integer>> hs = new HashSet();
        List<List<Integer>> ans = new ArrayList();
        
        int n = nums.length;
        
        for(int i=0 ; i< n ; i++)
        {
            for(int j = i+1 ; j< n ; j++)
            {
                for(int k=j+1 ; k<n ; k++ )
                {
                    if(nums[i]+ nums[j]+ nums[k] == 0 )
                    {
                        List<Integer> arr = new ArrayList();
                        arr.add(nums[i]);
                        arr.add(nums[j]);
                        arr.add(nums[k]);
                        Collections.sort(arr);
                        hs.add(new ArrayList(arr));
                      }
                }
            }
        }
        
        for(List<Integer> temp : hs)
        {
            ans.add(new ArrayList(temp));
        }
        return ans;
       */
        
        
        /*HashSet<Integer> temp ;
        HashSet<List<Integer>> hs = new HashSet();
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;
        for(int i=0 ; i<n ; i++)
        {
            temp = new HashSet();
            for(int j=i+1 ; j<n ; j++)
            {
               
                int k = -(nums[i]+nums[j]);
                
                if(temp.contains(k))
                {
                    List<Integer> list = new ArrayList();
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(k);
                    Collections.sort(list);
                    hs.add(new ArrayList(list));
                    
                }
                
                temp.add(nums[j]);
            }
        }
       
        for(List<Integer> list : hs)
        {
            ans.add(new ArrayList(list));
        }
      return ans; */
        
        
        // Optimal
        
        List<List<Integer>> ans = new ArrayList();
        Arrays.sort(nums);
        int n = nums.length;
        
        for(int i=0 ; i< n ; i++)
        {
            if(i>0 && nums[i]==nums[i-1]) continue;
            
            int j = i+1 ;
            int k = n-1;
            
            while(j<k)
            {
                int sum = nums[i]+nums[j]+nums[k];
                if(sum<0)
                {
                    j++;
                }
                else if(sum>0)
                {
                    k--;
                }
                if(sum==0)
                {
                    List<Integer>temp = new ArrayList();
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(nums[k]);
                    
                    ans.add(new ArrayList(temp));
                     j++;
                     k--;
                    while(j<k && nums[j]==nums[j-1]) j++;
                    while(j<k && nums[k]==nums[k+1]) k--;
                }
                
            }
        }
        return ans;
    }
}
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
     /*   
     //HashSet solution :
      int n = nums.length ;
   // a[i]+a[j]+a[k]---> store a[j] : check if a[k] = a[i]-a[j] exists in the set --> one triplet

      HashSet<List<Integer>> set = new HashSet<>();
          HashSet<Integer> st = new HashSet<>();    
      for(int i=0 ; i<n ; i++)
      {
      
        
        for(int j=i+1 ; j<n ; j++)
        {
          int third = -(nums[i]+nums[j]);
          
          if(st.contains(third))
          {
            List<Integer> temp = Arrays.asList(nums[i],nums[j],third);
            
            Collections.sort(temp);
            set.add(temp);
            
          }
          
          
          st.add(nums[j]);
        }
        st.clear();
       
      }
      
            List<List<Integer>> ans = new ArrayList<>(set);
            return ans;
     */ 
      
      
      // Optimal Solution : use 2pointer + sorting approach +  lowerBound / upperBound approach 
      
      int n = nums.length ;
      Arrays.sort(nums);
      
      List<List<Integer>>ans = new ArrayList<>();
      
      for(int i =0 ; i <n ; i++)
      {
        if(i>0 && nums[i]==nums[i-1]) continue ;
        
        int j = i+1;
        int k = n-1;
        
        while(j<k)
        {
          int sum = nums[i]+nums[j]+nums[k];
          
          if(sum>0)
          {
            k--;
          }
          else if(sum<0)
          {
            j++;
          }
          else
          {
            List<Integer> temp = Arrays.asList(nums[i],nums[j],nums[k]);
            ans.add(temp);
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
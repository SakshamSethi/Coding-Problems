class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
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
      
    }
}
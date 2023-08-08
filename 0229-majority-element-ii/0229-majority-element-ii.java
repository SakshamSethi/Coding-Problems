class Solution {
    public List<Integer> majorityElement(int[] nums) {
      
    /*  HashMap<Integer,Integer> map = new HashMap<>();
      int n=nums.length;
      for(int num : nums)
      {
        map.put(num,map.getOrDefault(num,0)+1);
      }
      List<Integer>ans = new ArrayList<>();
      for(Map.Entry<Integer,Integer> e : map.entrySet())
      {
        if(e.getValue()>n/3) ans.add(e.getKey());
      }
      return ans;
    */
      
      // Moore's Voting Algorithm 
      
      int n = nums.length ;
      
      int cnt1 = 0;
      int cnt2 =0 ;
      
      int ele1 = Integer.MIN_VALUE;
      int ele2 = Integer.MIN_VALUE;
      
      for(int i=0 ; i<n ; i++)
      {
        if(cnt1==0 && nums[i]!=ele2)
        {
          cnt1 = 1;
          ele1 = nums[i];
        }
        
        else if(cnt2==0 && nums[i]!=ele1)
        {
          cnt2=1;
          ele2 = nums[i];
        }
        
        else if(ele1==nums[i]) cnt1++;
        else if(ele2==nums[i]) cnt2++;
        
        else
        {
          cnt1--;
          cnt2--;
        }
        
        
      }
      
      cnt1 = 0;
      cnt2 = 0;
      
      for(int num : nums)
      {
        if(num==ele1)cnt1++;
        else if(num==ele2)cnt2++;
      }
      
List<Integer> ans = new ArrayList<>();
      
      if(cnt1>(n/3))ans.add(ele1);
      if(cnt2>(n/3))ans.add(ele2);
      return ans;
        
      
    }   
}
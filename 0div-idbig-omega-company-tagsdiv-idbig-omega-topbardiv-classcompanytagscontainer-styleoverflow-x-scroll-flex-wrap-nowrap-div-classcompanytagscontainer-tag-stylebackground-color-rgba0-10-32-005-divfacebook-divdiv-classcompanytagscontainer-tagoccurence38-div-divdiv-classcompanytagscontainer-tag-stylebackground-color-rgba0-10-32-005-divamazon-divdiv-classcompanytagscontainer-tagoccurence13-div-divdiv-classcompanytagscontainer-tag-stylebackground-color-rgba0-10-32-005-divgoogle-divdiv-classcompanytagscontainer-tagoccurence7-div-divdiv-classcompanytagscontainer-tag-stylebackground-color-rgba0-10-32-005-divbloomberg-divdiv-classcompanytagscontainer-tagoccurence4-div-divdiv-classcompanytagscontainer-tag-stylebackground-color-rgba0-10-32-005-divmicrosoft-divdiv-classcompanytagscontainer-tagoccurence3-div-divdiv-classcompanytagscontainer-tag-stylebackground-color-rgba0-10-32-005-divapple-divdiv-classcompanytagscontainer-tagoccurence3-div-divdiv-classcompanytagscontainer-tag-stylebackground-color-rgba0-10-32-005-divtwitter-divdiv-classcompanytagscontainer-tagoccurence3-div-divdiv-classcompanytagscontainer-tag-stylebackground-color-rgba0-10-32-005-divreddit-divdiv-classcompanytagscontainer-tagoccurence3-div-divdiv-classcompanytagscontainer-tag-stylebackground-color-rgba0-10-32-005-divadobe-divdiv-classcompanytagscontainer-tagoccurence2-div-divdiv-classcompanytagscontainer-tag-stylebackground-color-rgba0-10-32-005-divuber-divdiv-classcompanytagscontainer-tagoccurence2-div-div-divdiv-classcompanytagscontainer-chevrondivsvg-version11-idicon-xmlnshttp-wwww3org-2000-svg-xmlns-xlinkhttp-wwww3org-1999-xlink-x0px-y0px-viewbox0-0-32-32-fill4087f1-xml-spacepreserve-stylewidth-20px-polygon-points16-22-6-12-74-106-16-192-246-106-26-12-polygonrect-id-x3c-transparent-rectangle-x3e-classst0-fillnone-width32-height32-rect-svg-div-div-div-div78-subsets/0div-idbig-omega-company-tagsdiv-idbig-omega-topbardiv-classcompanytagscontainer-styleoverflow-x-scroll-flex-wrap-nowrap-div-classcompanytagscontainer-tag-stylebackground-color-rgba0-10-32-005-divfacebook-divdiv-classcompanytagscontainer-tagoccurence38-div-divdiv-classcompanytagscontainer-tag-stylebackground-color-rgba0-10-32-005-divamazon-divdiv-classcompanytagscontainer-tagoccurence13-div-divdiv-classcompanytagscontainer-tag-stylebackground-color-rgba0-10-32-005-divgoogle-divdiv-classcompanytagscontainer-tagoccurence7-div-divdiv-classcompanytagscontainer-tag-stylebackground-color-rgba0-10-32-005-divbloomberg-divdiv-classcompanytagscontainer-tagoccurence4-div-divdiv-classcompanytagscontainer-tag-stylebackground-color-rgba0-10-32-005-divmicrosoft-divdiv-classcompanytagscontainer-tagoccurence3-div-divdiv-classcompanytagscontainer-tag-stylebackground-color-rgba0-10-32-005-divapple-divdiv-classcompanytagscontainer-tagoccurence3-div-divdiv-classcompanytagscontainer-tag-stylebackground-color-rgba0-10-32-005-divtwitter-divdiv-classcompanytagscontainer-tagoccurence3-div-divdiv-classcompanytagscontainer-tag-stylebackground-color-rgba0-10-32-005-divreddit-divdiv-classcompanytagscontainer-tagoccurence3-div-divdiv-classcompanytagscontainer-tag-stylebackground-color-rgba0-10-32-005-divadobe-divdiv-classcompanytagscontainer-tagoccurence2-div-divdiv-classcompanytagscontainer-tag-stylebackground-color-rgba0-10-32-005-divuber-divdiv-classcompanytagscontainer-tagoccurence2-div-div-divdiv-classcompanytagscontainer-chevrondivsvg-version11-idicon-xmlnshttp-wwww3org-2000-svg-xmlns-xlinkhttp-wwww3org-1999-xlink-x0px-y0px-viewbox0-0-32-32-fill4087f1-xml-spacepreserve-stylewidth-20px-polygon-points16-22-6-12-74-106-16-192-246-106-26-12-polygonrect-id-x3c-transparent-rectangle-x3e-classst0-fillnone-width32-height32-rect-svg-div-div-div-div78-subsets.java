class Solution {
    public List<List<Integer>> subsets(int[] nums) {
      
      List<List<Integer>> ans = new ArrayList();
      
      powerSet(nums , 0 , new ArrayList<>(), ans );
      
      return ans;
      
    }
  
  void powerSet(int[]nums , int i , List<Integer>set , List<List<Integer>>ans)
  {
    if(i==nums.length)
    {
      ans.add(new ArrayList(set));
      return ;
    }
  
  
  //take case 
  
 set.add(nums[i]);
  powerSet(nums,i+1,set, ans );
    
 
    
  //not take case
     set.remove(set.size()-1);
  powerSet(nums,i+1,set,ans);
  }
}
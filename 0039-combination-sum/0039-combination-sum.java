class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
      
      findCombinations(candidates,0,target,new ArrayList(),ans);
      
      return ans;
      
    }
  
  void findCombinations(int[]arr , int i , int target , ArrayList<Integer>list , List<List<Integer>> ans)
  {
    if(i==arr.length|| target==0)
    {
      if(target==0)
      {
        ans.add(new ArrayList(list));
      }
      return ;
    }
    if(target<0)return;
    //take case
    list.add(arr[i]);
    findCombinations(arr,i,target-arr[i],list,ans);
    
    //notTake case
    list.remove(list.size()-1);
    findCombinations(arr,i+1,target,list,ans);
    
  }
  
}
class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        
      List<List<Integer>>ans = new ArrayList<>();
      if(candidates.length==0)return ans;
      
      List<Integer>list = new ArrayList<>();
      
      calculate(candidates , 0 , target , list  , ans);
      
      return ans;
    }
  
  void calculate(int[] arr , int i , int target , List<Integer>list , List<List<Integer>>ans  )
  {
    
    if(i==arr.length)
    {
      if(target==0)
      {
        ans.add(new ArrayList(list));
        return;
      }
      else 
        return;
    }
    if(target<0) return ;
    
    // take : 
    list.add(arr[i]);
    calculate(arr, i , target-arr[i] , list , ans );
    
    list.remove(list.size()-1);
    calculate(arr,i+1,target,list,ans);
    
    
  }
}
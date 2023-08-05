class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ans = new ArrayList<>();
      
      for(int i=0 ;i < candies.length; i++)
      {
        if(isMax(candies[i]+extraCandies , candies))
          ans.add(true);
       
        else ans.add(false);
      }
      return ans;
    }
  boolean isMax(int n , int[] arr)
  {
    int maxi = n ;
    
    for(int candy : arr)
      maxi=Math.max(maxi,candy);
    
    return maxi==n ;
  }
}
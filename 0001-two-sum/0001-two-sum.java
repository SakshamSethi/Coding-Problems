class Solution {
    public int[] twoSum(int[] arr, int target) {
        
      
      HashMap<Integer,Integer> map = new HashMap();
      int[]ans=new int[2];
      int n = arr.length;
      map.put(arr[0],0);
      for(int i=1 ; i< n ; i++)
      {
        if(map.containsKey(target-arr[i]))
        {
          ans[0]= i;
          ans[1]=map.get(target-arr[i]);
          
        }
        map.put(arr[i],i);
      }
      
      return ans;
    }
}
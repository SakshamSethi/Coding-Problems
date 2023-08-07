class Solution {
    public List<Integer> majorityElement(int[] nums) {
      
      HashMap<Integer,Integer> map = new HashMap<>();
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
    }
}
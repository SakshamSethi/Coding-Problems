class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        
        int count = 0;
        HashMap<Integer,Integer> hmap = new HashMap();
        hmap.put(0,1);
        int currSum = 0;
        for(int i=0 ; i< nums.length ; i++)
        {
            currSum+=nums[i];
            
            int rem = currSum%k;
            if(rem<0) rem+=k;
            System.out.println(rem);
            if(hmap.containsKey(rem))
            {
                count+=hmap.get(rem);
            }
             
            
             
            hmap.put(rem,hmap.getOrDefault(rem,0)+1);
            
        }
        return count;
    }
}
class Solution {
    public List<List<Integer>> permute(int[] nums) {

        List<List<Integer>>ans = new ArrayList<>();
        
        count(nums,ans,new ArrayList<Integer>());
        
        return ans;
    }
    
    void count(int[]nums,  List<List<Integer>>ans ,  List<Integer>curr)
    {
        if(curr.size()==nums.length)
        {
            ans.add(new ArrayList<>(curr));
            return;
        }
        for(int i=0;i<nums.length;i++)
        {
            int temp = nums[i];
            if(nums[i]!= -11)
            { 
                nums[i]= -11;
                curr.add(temp);
                count(nums,ans,curr);
                nums[i]=temp;
                curr.remove(curr.size()-1);
                
            }
            
        }
        return;
    }
}
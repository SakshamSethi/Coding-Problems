class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        
        int n=num.length;
        for(int i = n-1 ; i>=0; i--)
        {
            k = k + num[i];
            num[i]=k%10;
            k=k/10;
        }
        
        List<Integer>ans = new ArrayList();
        for(int x : num)ans.add(x);
        
        while(k>0)
        {
            ans.add(0,k%10);
            k/=10;
        }
        
        return ans;
    }
}
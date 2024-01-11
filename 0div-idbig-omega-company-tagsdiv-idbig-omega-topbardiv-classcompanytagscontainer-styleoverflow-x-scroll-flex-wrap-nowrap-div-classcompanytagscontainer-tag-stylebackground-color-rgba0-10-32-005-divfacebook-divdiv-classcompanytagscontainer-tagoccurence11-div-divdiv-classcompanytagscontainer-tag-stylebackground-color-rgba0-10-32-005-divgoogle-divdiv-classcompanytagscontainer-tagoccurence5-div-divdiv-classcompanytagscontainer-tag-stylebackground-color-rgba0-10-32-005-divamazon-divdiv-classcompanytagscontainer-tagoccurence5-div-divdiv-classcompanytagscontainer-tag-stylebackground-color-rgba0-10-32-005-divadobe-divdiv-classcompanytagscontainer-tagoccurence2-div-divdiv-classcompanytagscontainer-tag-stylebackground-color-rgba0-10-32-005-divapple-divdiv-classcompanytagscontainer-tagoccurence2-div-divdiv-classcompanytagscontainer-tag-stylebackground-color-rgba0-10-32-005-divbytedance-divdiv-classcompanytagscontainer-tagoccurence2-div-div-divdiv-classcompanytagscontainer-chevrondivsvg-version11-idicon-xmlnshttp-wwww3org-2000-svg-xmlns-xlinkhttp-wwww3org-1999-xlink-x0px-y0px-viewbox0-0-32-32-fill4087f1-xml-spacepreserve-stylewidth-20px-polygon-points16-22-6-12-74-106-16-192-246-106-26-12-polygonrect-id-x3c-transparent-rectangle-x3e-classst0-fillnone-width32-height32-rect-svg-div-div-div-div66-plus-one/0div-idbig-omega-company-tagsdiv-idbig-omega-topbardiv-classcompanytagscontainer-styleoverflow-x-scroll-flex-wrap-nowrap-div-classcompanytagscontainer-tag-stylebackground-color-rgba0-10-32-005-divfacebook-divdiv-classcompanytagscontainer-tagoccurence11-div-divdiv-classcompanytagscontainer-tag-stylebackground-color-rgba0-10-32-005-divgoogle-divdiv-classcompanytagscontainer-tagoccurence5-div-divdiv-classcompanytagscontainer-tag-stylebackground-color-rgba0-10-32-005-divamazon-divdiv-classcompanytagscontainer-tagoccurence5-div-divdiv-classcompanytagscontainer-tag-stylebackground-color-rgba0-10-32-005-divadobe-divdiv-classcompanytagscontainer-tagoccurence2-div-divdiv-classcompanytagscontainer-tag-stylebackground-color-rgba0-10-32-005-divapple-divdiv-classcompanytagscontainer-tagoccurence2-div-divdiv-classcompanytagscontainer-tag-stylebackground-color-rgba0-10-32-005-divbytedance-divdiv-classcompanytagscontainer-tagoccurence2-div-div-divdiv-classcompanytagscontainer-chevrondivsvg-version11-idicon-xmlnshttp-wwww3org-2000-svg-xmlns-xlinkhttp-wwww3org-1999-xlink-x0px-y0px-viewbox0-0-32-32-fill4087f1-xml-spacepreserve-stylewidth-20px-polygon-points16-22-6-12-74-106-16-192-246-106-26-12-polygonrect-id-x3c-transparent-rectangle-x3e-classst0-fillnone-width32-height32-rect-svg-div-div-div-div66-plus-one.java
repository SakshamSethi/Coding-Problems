class Solution {
    public int[] plusOne(int[] num) {
        
            int k=1;
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
        
        int[] arr = new int[ans.size()];
        
        for(int i=0 ; i<ans.size();i++)arr[i]=ans.get(i);
        
        
        return arr ;
    }
}
class Solution {
    public int kthGrammar(int n, int k) {
      
      // use ceil for k
      
      if(n==1)return 0;
      
      int parent = kthGrammar(n-1 ,(k+1)/2);
      
      if(parent==1)
      {
        return k%2==1?1:0;
      }
      else
        return k%2==1?0:1;
    }
}
class Solution {
    public int[] plusOne(int[] digits) {
      
      int n = digits.length;
      int one = 1;
     
      LinkedList<Integer>ans = new LinkedList<>();
      
      for(int i=n-1 ; i>=0 ; i--)
      {
        one = digits[i]+one;
        ans.addFirst(one%10);
        one = one/10;
        
      }
      
      while(one>0)
      {
        ans.addFirst(one%10);
        one/=10;
      }
      
      int[] plusOne = new int[ans.size()];
      int k=0;
      for(int ele : ans)
      {
        plusOne[k++] = ele;
        
      }
      
      return plusOne;
      
    }
}
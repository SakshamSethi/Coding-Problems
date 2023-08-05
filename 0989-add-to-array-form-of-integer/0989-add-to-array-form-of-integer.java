class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
       
      // using K as Carry    
      
      LinkedList<Integer> list = new LinkedList<>();
      int n=num.length;
      for(int i= n-1 ; i>=0 ; i--)
      {
        k = k+num[i];
        list.addFirst(k%10);
        k=k/10;
        
        
      }
      
      while(k>0)
      {
        list.addFirst(k%10);
        k=k/10;
      }
      return list;
      
    }
}
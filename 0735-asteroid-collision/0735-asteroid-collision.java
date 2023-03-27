class Solution {
    public int[] asteroidCollision(int[] a) {
       Stack<Integer> st = new Stack();
        
        for(int i=0 ;i<a.length;i++)
        {
            if(a[i]>=0)
            {
                st.push(a[i]);
            
            }
          else
          {
              
          
            while(!st.isEmpty() && st.peek()>0 && st.peek()< -1*a[i])
            {
                st.pop();
            }
            
            if(!st.isEmpty() && st.peek()== -1*a[i])
            {
                st.pop();
            }
              else if(!st.isEmpty() && st.peek()>-a[i])
              {
                  
              }
            else
            {
                st.push(a[i]);
            }
          }
                }

        int[] ans = new int[st.size()];
  int k=st.size()-1;
        while(!st.isEmpty()) 
        {
            ans[k--]=st.pop();
        }
        
        return ans;
    }
}
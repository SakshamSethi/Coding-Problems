class Solution {
    public boolean canReach(String s, int minJump, int maxJump) {
     
      Queue<Integer> q = new LinkedList<>();
      
      q.offer(0);
      for(int i= 1 ; i<s.length();i++)
      {
        if(s.charAt(i)=='0')
        {
          while(!q.isEmpty() && q.peek()<i-maxJump) q.poll();
          
         if(q.isEmpty()) return false;
          
          int prev = q.peek();
          
          if(prev>=i-maxJump && prev<=i-minJump)
          {
            q.offer(i);
            if(i==s.length()-1)return true;
          }
          
        }
      }
      
      return false;
    }
}
class Solution {
    public String convertToTitle(int c) {
        
        StringBuilder s = new StringBuilder();
        
        while(c>0)
        {
            int rem = (c-1)%26;
         
            
            c=(c-1)/26;
            s.append((char)('A'+rem));
                
        }
        return s.reverse().toString();
    }
}
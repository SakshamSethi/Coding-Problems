class Solution {
    public String reverseWords(String s) {
        String[] arr = s.split(" ");
          StringBuffer ans = new StringBuffer();
        
        for(String str : arr)
        {
            StringBuffer st = new StringBuffer(str);
            ans.append(st.reverse()+" ");
            
        }
        return ans.toString().trim();
        
    }
}
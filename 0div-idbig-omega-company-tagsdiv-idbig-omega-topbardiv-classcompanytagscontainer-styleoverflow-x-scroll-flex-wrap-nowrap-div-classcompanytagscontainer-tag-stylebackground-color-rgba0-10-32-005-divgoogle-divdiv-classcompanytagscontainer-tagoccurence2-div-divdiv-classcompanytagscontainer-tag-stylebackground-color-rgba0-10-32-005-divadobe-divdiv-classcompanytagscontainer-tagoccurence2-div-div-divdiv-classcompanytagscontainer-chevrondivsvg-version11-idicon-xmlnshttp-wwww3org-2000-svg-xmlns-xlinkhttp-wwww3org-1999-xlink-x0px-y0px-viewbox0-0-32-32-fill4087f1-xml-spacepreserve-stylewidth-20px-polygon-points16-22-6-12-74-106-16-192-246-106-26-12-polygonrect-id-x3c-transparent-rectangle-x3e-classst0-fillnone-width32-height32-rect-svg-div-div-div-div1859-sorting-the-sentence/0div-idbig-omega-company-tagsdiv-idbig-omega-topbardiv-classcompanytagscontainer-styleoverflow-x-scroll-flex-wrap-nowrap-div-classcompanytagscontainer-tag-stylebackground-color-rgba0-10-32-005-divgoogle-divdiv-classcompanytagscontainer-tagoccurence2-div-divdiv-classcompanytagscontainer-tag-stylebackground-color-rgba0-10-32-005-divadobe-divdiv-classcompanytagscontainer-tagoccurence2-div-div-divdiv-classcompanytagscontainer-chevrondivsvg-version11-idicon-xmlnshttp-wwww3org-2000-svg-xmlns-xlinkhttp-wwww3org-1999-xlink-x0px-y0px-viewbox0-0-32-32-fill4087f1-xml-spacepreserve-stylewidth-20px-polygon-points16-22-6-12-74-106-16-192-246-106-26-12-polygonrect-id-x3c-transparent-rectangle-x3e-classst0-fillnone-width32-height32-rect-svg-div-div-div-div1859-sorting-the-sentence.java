class Solution {
    public String sortSentence(String s) {
        
        s=s.trim();
        String[] arr = s.split(" ");
        
        String[] ans = new String[arr.length];
        
        for(String str : arr)
        {
            int pos = (int)(str.charAt(str.length()-1)-'0');
             ans[pos-1] = str.substring(0,str.length()-1);
            
        }
        
        StringBuilder sb = new StringBuilder();
        
        for(String str : ans)
        {
            sb.append(str+" ");
        }
        return sb.toString().trim();
    }
}
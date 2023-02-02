class Solution {
    public String longestCommonPrefix(String[] strs) {
     
        String s = new String("");
        
        Arrays.sort(strs);
        int ch=0;
        String s1 = strs[0];
        String s2 = strs[strs.length-1];
        
        for(int i=0;i<s1.length();i++)
        {
            if(s1.charAt(i)==s2.charAt(i))
                ch++;
            else break;
        }
        if(ch==0) return "";
        s = s2.substring(0,ch);
        return s;
    }
}
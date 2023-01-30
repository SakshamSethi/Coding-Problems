class Solution {
    public String restoreString(String s, int[] in) {
    int i = in.length;
        char[] ch = new char[i];
        for(int x=0;x<i;x++)
        {
            ch[in[x]] = s.charAt(x);
        }
    
        return new String(ch);
    }
}
class Solution {
    public String freqAlphabets(String s) {
        StringBuilder sb = new StringBuilder("");
        int v = 0;
        int i = s.length() - 1;
        
        while (i >= 0) {
            if (s.charAt(i) == '#') {
                v = Integer.parseInt(s.substring(i-2, i)) - 1;
                i = i - 2;
            } else {
                v = s.charAt(i) - '0' - 1;
            }
            sb.append((char)('a' + v));
            i--;
        }
        
        return sb.reverse().toString();
    }
}
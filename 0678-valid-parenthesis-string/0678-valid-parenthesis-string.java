class Solution {
    	public boolean checkValidString(String s) {
        int bal = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '*') bal++;
            else if (bal-- == 0) return false;
        }
        if (bal == 0) return true;
        bal = 0;
        for (int i = s.length()-1; i >= 0; i--) {
            if (s.charAt(i) == ')' || s.charAt(i) == '*') bal++;
            else if (bal-- == 0) return false;
        }
        return true;
    }
}
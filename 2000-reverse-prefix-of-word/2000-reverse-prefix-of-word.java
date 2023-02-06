class Solution {
    public String reversePrefix(String word, char ch) {
        
        int i = word.indexOf(ch);
        System.out.println(i);
        if(i == -1) return word;
        
        StringBuilder s = new StringBuilder(word.substring(0,i+1));
        StringBuilder s2 = new StringBuilder(word.substring(i+1,word.length()));
        s = s.reverse();
        return s.append(s2).toString();
    }
}
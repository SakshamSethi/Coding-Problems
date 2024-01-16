class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        Arrays.sort(strs);// , (s1,s2)->(s1.length()-s2.length()));
        
        String s1 = strs[0];
        String s2 = strs[strs.length-1];
     for(String s : strs)
     {
         System.out.println(s);
     }
        StringBuilder ans = new StringBuilder();
        
    for(int i=0 ; i< s1.length();i++)
    {
        if(s1.charAt(i)==s2.charAt(i)) ans.append(s1.charAt(i));
               else break;
    }
        return ans.toString();
        
    }
}
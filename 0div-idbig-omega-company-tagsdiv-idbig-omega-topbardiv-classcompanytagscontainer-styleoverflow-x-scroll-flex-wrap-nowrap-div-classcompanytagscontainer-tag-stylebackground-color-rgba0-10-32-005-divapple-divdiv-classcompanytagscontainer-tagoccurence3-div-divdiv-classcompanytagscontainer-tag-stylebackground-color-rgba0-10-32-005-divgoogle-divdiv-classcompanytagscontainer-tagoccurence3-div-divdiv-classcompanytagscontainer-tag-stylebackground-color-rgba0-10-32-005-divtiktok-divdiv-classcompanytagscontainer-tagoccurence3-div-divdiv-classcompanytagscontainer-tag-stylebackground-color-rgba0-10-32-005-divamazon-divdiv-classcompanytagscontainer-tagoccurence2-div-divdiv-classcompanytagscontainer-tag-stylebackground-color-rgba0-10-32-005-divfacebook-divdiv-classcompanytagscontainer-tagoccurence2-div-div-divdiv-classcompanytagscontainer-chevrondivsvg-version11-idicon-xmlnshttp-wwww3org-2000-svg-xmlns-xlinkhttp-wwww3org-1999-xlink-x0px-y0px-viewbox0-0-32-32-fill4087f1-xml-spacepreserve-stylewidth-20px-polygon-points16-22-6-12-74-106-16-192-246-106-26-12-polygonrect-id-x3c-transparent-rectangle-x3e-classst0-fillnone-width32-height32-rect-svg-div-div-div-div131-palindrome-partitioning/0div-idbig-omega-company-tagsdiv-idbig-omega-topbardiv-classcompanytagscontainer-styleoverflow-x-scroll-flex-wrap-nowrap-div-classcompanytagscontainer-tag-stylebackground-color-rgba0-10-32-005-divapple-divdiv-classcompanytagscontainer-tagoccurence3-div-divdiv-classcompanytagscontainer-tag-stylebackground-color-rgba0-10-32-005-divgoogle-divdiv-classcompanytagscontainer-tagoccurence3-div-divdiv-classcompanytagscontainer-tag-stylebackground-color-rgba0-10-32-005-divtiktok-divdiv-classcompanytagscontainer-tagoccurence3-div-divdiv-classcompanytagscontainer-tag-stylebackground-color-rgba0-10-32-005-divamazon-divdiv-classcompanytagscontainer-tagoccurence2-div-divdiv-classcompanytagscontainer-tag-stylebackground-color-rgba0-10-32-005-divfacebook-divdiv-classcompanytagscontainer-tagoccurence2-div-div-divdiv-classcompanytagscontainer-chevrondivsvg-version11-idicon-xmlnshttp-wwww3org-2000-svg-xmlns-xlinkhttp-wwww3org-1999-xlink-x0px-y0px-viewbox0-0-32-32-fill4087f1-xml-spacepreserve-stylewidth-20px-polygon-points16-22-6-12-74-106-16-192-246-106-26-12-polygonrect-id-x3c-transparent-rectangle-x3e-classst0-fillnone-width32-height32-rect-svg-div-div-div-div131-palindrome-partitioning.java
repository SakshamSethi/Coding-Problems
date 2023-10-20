class Solution {
    public List<List<String>> partition(String s) {
        
  List<List<String>> ans = new ArrayList<>();
        
        compute(s,0,new ArrayList(),ans);
    
        return ans;
    
    }
    
    void compute(String s , int idx , List<String>parts , List<List<String>>ans)
    {
        if(idx == s.length())
        {
            ans.add(new ArrayList(parts));
            return ;
        }
        
        
        for(int i = idx ; i<s.length() ;i++)
        {
            if(isPalindrome(s,idx,i))
            {
                parts.add(s.substring(idx,i+1));
                compute(s,i+1,parts,ans);
                parts.remove(parts.size()-1);
            }
        }
        
        return;
    }
    boolean isPalindrome(String s , int i , int j)
    {
        while(i<j && s.charAt(i)==s.charAt(j))
        {
            i++;
            j--;
        }
        return i>=j ;
    }
}
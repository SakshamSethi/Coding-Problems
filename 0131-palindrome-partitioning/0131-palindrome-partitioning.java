class Solution {
    public List<List<String>> partition(String s) {
       List<List<String>>ans = new ArrayList<>();
        
        func(0,s,ans,new ArrayList<String>());
        return ans;
        
    }
    static void func(int indx , String s , List<List<String>> ans , List<String>path)
    {
        if(s.length()==indx)
        {
            ans.add(new ArrayList<String>(path));
            return ;
        }
        
        for(int i=indx;i<s.length();i++)
        {
            if(palindrome(s,indx,i))
            {
                path.add(s.substring(indx,i+1));
                func(i+1,s,ans,path);
                path.remove(path.size()-1);
                
            }
        }
        return;
    }
    static boolean palindrome(String str , int s , int e)
    {
        while(s<=e)
        {
            if(str.charAt(s)!=str.charAt(e)) return false;
            s++;e--;
        }
        return true;
    }
}
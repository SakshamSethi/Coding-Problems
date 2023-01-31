class Solution {
    public String reverseWords(String s) {
        String[] ans = s.split(" ");
        StringBuilder jawab = new StringBuilder();
       
        for(int i=0;i<ans.length;i++)
           
        {
            StringBuilder ch = new StringBuilder(ans[i]);
            if(i==ans.length-1)
            {
                jawab = jawab.append(ch.reverse());
            }
            
            else
            jawab = jawab.append(ch.reverse()+" ");
        }
        return jawab.toString();
    }
}
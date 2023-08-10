class Solution {
    boolean isPossible(String text,String pattern,int[] lps)
    {
        int n=text.length();
        int m=pattern.length();
        int i=0,j=0;
        while(i<n)
        {
            if(text.charAt(i)==pattern.charAt(j))
            {
                i++;j++;
            }
            else{
                if(j==0)i++;
                else{
                    j=lps[j-1];
                }
            }
            if(j==m)return true;
        }
        return false;
    }

    public int repeatedStringMatch(String a, String b) {
        //BY USING KMP ALGORITHM  (https://www.geeksforgeeks.org/kmp-algorithm-for-pattern-searching/)
        int n=a.length();
        int m=b.length();
        int repeat=(int)Math.ceil((double)m/n);
        String ans=new String();
        for(int i=0;i<repeat;i++)
        {
            ans+=a;
        }
        int lps[]=new int[m];
        lps[0]=0;
        int len=0;
        int ind=1;
        while(ind<m)
        {
            if(b.charAt(len)==b.charAt(ind))
            {
                lps[ind]=len+1;
                len++;
                ind++;
            }
            else
            {
                if(len==0){
                    lps[ind]=0;
                    ind++;
                }
                else{
                    len=lps[len-1];
                }
            }
        }
        for(int i=0;i<3;i++)    //(0)possibily itself,(1) one added before/after , (2)one before and one after for the "ans"
        {
            if(isPossible(ans,b,lps))
            {
                return repeat+i;
            }
            ans+=a;
        }
        return -1;
    }
}

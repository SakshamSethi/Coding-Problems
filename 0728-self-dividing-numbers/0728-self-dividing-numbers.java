class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> l = new ArrayList();
for(int i = left ; i<= right ;i++)
{
if( Check(i)== true)
{
    l.add(i);
}
}
return l;
    }
    public boolean  Check(int n)
    {
        int x =n;
       while(n>0)
       {
           int r = n%10 ;
           if(r ==0) return false;
           
               
           
           if(x%r !=0)
           return false;

           n=n/10;
       }
       return true;
    }
}
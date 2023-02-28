class Solution {
    public int nextvalue(int n){
        int s=0;
        int val=0;
        while(n!=0)
        {
            val=(n%10);
            s+=val*val;
            n/=10;
        }
        return s;
    }
    public boolean isHappy(int n) {
        while((n/10)!=0){
            n=nextvalue(n);
        }
        if (n==1 || n==7)
            return true;
        else
            return false;
    }
}
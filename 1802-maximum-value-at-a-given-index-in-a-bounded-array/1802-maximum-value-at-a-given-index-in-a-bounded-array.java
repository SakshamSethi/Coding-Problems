class Solution {
    public int maxValue(int n, int index, int maxSum) {
        
        long l = index ;
        long r = n-index-1;
        long e = maxSum , s=1 , res =0;
        
        while(s<=e)
        {
            long mid = s +(e-s)/2;
            long m = mid-1;
            long ls=0 , rs=0;
            long sum = mid;
            
            if(r<=m)
            {
                rs = m*(m+1)/2 - (m-r)*(m-r+1)/2;
            }
            else 
            {
                rs  = m*(m+1)/2 + (r-m)*1;
            }
             if(l<=m)
            {
                ls = m*(m+1)/2 - (m-l)*(m-l+1)/2;
            }
            else 
            {
                ls  = m*(m+1)/2 + (l-m)*1;
            }
            
            sum+=ls+rs;
            
            if(sum<=maxSum)
            {
                res = mid;
                s = mid+1;
            }
            else
            {
                
                e = mid-1;
                
            }
            
        }
        return (int)res;
    }
}
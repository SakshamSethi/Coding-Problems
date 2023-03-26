class Solution {
    public int trap(int[] a) {
        
        if(a.length<=2)return 0;
        
        // using two pointers approach 
        
        int l = 0;
        int r = a.length-1;
        int lmax=0;
        int rmax=0;
        int res=0;
        
        while(l<=r)
        {
            if(a[l]<=a[r])
            {
                if(a[l]>= lmax) { lmax= a[l] ;}
                else {res += lmax-a[l] ; }
            l++;
            }
            else 
            {
            if(a[r] >= rmax )
            {
                rmax = a[r];
            }
                else
                {
                    res+= rmax - a[r];
                }
                r--;
            }
            
        }
        return res;
    }
}
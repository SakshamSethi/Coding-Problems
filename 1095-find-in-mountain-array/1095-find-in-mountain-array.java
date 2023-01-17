/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        
        int s=0,x=mountainArr.length()-1,m=0;
        int peak =0;int e=x;
        while(s!=e)
        {
            m= s+(e-s)/2;
            if(mountainArr.get(m)>mountainArr.get(m+1))
            {
                e=m;
            }
            else
            {
            s=m+1;
             }
        }
        
        peak =s;
        System.out.println(peak);
        s=0;
        e=peak;
        while(s<=e)
        {
            m = s+(e-s)/2;
            if(target== mountainArr.get(m))
            {
                return m;
               
            }
            else if(target>mountainArr.get(m))
            {
                s=m+1;
            }
            else
            {
                e=m-1;
            }
        }
        s=peak+1;
        e=x;
         while(s<=e)
        {
            m = s+(e-s)/2;
            if(target== mountainArr.get(m))
            {
                return m;
            }
            else if(target>mountainArr.get(m))
            {
                e=m-1;
            }
            else
            {
                s=m+1;
            }
        }
        return -1;
    }
}
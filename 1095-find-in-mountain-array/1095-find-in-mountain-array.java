class Solution {
    public int findInMountainArray(int target, MountainArray arr) {
        
       int start =0;
        int end = arr.length()-1;
        int mid=0;
        while(start!=end)
        {
            mid = start + (end-start)/2;
            
      
         
            if(arr.get(mid)>arr.get(mid+1))
            {
                end = mid;
            }
            else if(arr.get(mid)<arr.get(mid+1))
            {
                start = mid+1;
            }
        }
        int peak = start;
        start = 0;
        end = peak;
        int x= bs(arr,target,start,end);
        start =peak;
        end = arr.length()-1;
        int y =bsr(arr,target,start,end);
        if(x>-1 && y>-1)
        {
            return x;
        }
        else if(x==-1)
        {return y;
        }
            else { return x;
                 }
            
    }
    static int bs(MountainArray arr , int target,int start,int end)
    {
        while(start<=end)
        {
       int mid = start + (end-start)/2;
            if(target==arr.get(mid))
            {
                return mid;
            }
            else if(target>arr.get(mid))
            {
                start =mid+1;
            }
            else
            {
                end=mid-1;
            }
        }
        return -1;
    }
    static int bsr(MountainArray arr , int target,int start,int end)
    {
        while(start<=end)
        {
       int mid = start + (end-start)/2;
            if(target==arr.get(mid))
            {
                return mid;
            }
            else if(target>arr.get(mid))
            {
                end =mid-1;
            }
            else
            {
                start=mid+1;
            }
        }
        return -1;
    }
}
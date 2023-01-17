class Solution {
    public int search(int[] nums, int target) {
        

        int s=0,e=nums.length-1,mid=0;
   
    int pivot=0;
       pivot = Pivot(nums);
       
        System.out.println(pivot);
      if(pivot ==-1)
      {
          return BS(nums,s,e,target);
          
      }
        else if(nums[pivot]==target)
        {
            return pivot;
        }
       else if(nums[0]<=target)
       {
           return BS(nums,s,pivot-1,target);
       }
        else
        {
            return BS(nums,pivot+1,e,target);
        }
           
           
       
       
    }
    static int BS(int[] nums , int s,int e,int target)
    {
        int mid=0;
        while(s<=e)
        {
      
            mid = s+(e-s)/2;
        System.out.println(mid);
            if(nums[mid]==target)
                return mid;
            else if(nums[mid]>target)
                e=mid-1;
            else
                s=mid+1;
        }
        
        return -1;
    }
static int Pivot(int[] nums)
{
   int s=0,e=nums.length-1,mid=0;
     while(s<=e)
        {
            mid = (s + (e-s)/2);
           
         if(mid<e && nums[mid]>nums[mid+1])
         {return mid;
         }
           if(mid>s && nums[mid-1]>nums[mid] )
           {      return mid-1;
           }
         if(nums[mid]<=nums[s])
         {
             e=mid-1;
         }
         else
         {
             s=mid+1;
        }
     }
    
    return -1;    
}

}

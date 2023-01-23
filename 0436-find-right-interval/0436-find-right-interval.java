class Solution {
    public int[] findRightInterval(int[][] intervals) {
     HashMap<Integer,Integer> map = new HashMap<>();
        int n=intervals.length;
     int arr[] = new int[n];
        int ans[] = new int[n];
        for(int i=0;i<n;i++)   
     {
         arr[i] = intervals[i][0];
            map.put(arr[i],i);
     }
        Arrays.sort(arr);
        
        for(int i=0;i<n;i++)
        {
            ans[i] = BS(arr,map,intervals[i][1],n);
            
        }
        return ans;
        
    }
    
    static int BS(int[] arr , HashMap map , int target , int n)
    {
        int s =0;
        int e = n-1;
        int x=Integer.MIN_VALUE;int flag=1;
        while(s<=e)
        { 
            int m= s +(e-s)/2;
            if(target == arr[m])
            {
                x=arr[m];
                break;
            }
            
            if(arr[m]<target)
            {
                s=m+1;
            }
            else
            {
                if(flag==1){
                    x= arr[m];
                }
                else
                {
                    if(x>arr[m])
                        x=arr[m];
                }
                
                e=m-1;
                
                    
                
                
            }
            
        }
        if(x== Integer.MIN_VALUE) return -1;
           
    return (int)map.get(x);
        
        
    }
}
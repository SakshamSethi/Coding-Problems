class Solution {
    public int findKthPositive(int[] arr, int k) {
        
        int s = 0;
        int e = arr.length-1;
        while(s<=e)
        {  System.out.println(e);
            int m = s +(e-s)/2;
           if((arr[m]-(m+1)) < k )
            {
                s=m+1;
            }
            else
            {
                e=m-1;
            }
            
        }
        System.out.print(e);
        if(e==-1) return k;
        return arr[e] + (k -(arr[e]-(e+1)));
    }
}
//https://youtube.com/watch?v=88k8xa-pSrM&si=EnSIkaIECMiOmarE reference 
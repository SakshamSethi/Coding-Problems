//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            ArrayList<Integer> arr = new ArrayList<>();
            for(int i = 0;i<n;i++)
                {
                    int x = sc.nextInt();
                    arr.add(x);
                }
            int m = sc.nextInt();
            
            Solution ob = new Solution();
            
    		System.out.println(ob.findMinDiff(arr,n,m));
        }
        
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        // your code here
    Collections.sort(a);
    
    if(n==0 || m>n )return 0;
    
    int winSize = n-m+1;
    
    int minCount=Integer.MAX_VALUE;
    int count=0;
    for(int i=0 ; i<a.size()-m+1;i++)
    {
        count = Math.abs(a.get(i+m-1)-a.get(i)); 
        minCount=Math.min(minCount,count);
         
    }
    return minCount;
    }
}
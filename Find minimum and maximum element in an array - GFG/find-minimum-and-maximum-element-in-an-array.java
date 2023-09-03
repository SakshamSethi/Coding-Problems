//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class Pair  
{  
    long first, second;  
    public Pair(long first, long second)  
    {  
        this.first = first;  
        this.second = second;  
    }  
}

class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            long n = Long.parseLong(br.readLine().trim());
            long a[] = new long[(int)(n)];
            // long getAnswer[] = new long[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(inputLine[i]);
            }
            
            Compute obj = new Compute();
            Pair product = obj.getMinMax(a, n); 
            System.out.println(product.first+" "+product.second);
            
        }
	}
}


// } Driver Code Ends


//User function Template for Java

/*
 class Pair  
{  
    long first, second;  
    public Pair(long first, long second)  
    {  
        this.first = first;  
        this.second = second;  
    }  
} */

class Compute 
{
    static Pair getMinMax(long a[], long n)  
    {
        // recursion gives Stack OverFLow
         /*long min = getMin(a,n);
         long max = getMax(a,n);
         return new Pair(min,max);
        */
        
        long min = Long.MAX_VALUE;
        long max = Long.MIN_VALUE;
        
        for(long ele : a)
        {
            min = Math.min(min,ele);
            max = Math.max(max,ele);
        }
        
        return new Pair(min,max);
        
    }
/*    static long getMin(long[]a , long n)
    {
    if(n==1) return a[0];    
     return Math.min(a[(int)(n-1)] , getMin(a,n-1));
    }
         
     static long getMax(long[]a , long n)
    {
    if(n==1) return a[0];    
     return Math.max(a[(int)(n-1)] , getMax(a,n-1));
    }    */
}

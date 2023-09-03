//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

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
            long Triangle[] = obj.getTriangle(a, n);
            int sz = Triangle.length;
            
            StringBuilder output = new StringBuilder();
            for(int i=0;i<sz;i++)
                output.append(Triangle[i]+" ");
            System.out.println(output);
            
        }
	}
}



// } Driver Code Ends


//User function Template for Java

class Compute {
    
    public long[] getTriangle(long arr[], long n)
    {
        List<Long> ans = new ArrayList<>();
        
        generateTriangle(arr,n,ans);
        
        for(long ele : arr) ans.add(ele);

        long[] ansArray = new long[ans.size()];
        
        for(int i=0 ; i<ans.size();i++)
        {
            ansArray[i] = ans.get(i);
        }
        return ansArray;
    }
    
    void generateTriangle(long[]arr , long n , List<Long>ans)
    {
        if(n<=1) return ;
        
        long[] temp = new long[(int)(n-1)];
        
        for(int i=0 ; i<n-1 ; i++)
        {
            temp[i] = arr[i]+arr[i+1];
        }
        
        generateTriangle(temp,n-1,ans);
        
        for(long ele :temp)
        {
            ans.add(ele);
        }
        
        return;
        
    }
    
}
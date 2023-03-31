//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0)
        {
            int N = sc.nextInt();
            int M[][] = new int[N][N];
            for(int i=0; i<N; i++)
            {
                for(int j=0; j<N; j++)
                {
                    M[i][j] = sc.nextInt();
                }
            }
            System.out.println(new Solution().celebrity(M,N));
            t--;
        }
    } 
} 
// } Driver Code Ends


//User function Template for Java


class Solution
{ 
    //Function to find if there is a celebrity in the party or not.
    int celebrity(int a[][], int n)
    {
    	// code here 
    	Stack<Integer>st = new Stack<>();
    	
    	for(int i=0;i<n;i++)
    	{
    	    st.push(i);
    	}
    	
    while(st.size()>=2)
    	{
    	    int f = st.pop();
    	    int s = st.pop();
    	    
    	    if(a[f][s]==1) st.push(s);
    	    else st.push(f);
    	    
    	    
    	}
    	int ans = st.pop();
    	boolean ok=true;
    	for(int i=0;i<n;i++)
    	{
    	    if( i==ans) {continue;}
    	    if(a[ans][i]==1 || a[i][ans]==0) { ok = false ;}
    	}
    	
    	return ok==true?ans:-1;
    }
}
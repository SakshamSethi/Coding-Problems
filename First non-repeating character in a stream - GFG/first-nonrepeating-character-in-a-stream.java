//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String A = br.readLine().trim();
            Solution ob = new Solution();
            String ans = ob.FirstNonRepeating(A);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


class Solution
{
    public String FirstNonRepeating(String A)
    {
        // code here
    
        Queue<Character>q = new LinkedList<>();
        int[]freq = new int[26];
        String ans ="";
        for(int i=0 ;i< A.length();i++)
        {
            q.add(A.charAt(i));
            freq[A.charAt(i)-97]++;
            
            while(!q.isEmpty() && freq[q.peek()-97]>1)
            {
                q.remove();
            }
            if(q.isEmpty()) ans +='#';
            else ans +=q.peek();
        }
        return ans;
    }
}
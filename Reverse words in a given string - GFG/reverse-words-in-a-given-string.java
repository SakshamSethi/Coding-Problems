//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            String s = sc.next();
            Solution obj = new Solution();
            System.out.println(obj.reverseWords(s));
            t--;
        }
    }
}

// } Driver Code Ends



class Solution 
{
    //Function to reverse words in a given string.
    String reverseWords(String S)
    {
        String[] arr =  S.split("\\.");
    
        StringBuilder ans = new StringBuilder();
        
        for(int i=arr.length-1 ; i>=0 ; i-- )
        {
          
           ans= ans.append(arr[i]);
            if(i!=0)ans=ans.append(".");
        }
        
        return ans.toString();
        
    }
}
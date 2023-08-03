//{ Driver Code Starts
import java.io.*;
import java.util.*;


class IntArray
{
    public static int[] input(BufferedReader br, int n) throws IOException
    {
        String[] s = br.readLine().trim().split(" ");
        int[] a = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = Integer.parseInt(s[i]);
        
        return a;
    }
    
    public static void print(int[] a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }
    
    public static void print(ArrayList<Integer> a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            int N; 
            N = Integer.parseInt(br.readLine());
            
            
            int[] S = IntArray.input(br, N);
            
            
            int[] F = IntArray.input(br, N);
            
            Solution obj = new Solution();
            ArrayList<Integer> res = obj.maxMeetings(N, S, F);
            
            IntArray.print(res);
            
        }
    }
}

// } Driver Code Ends

class Pair
{
    int start ; int end , index ;
 Pair(int start , int end, int index)
 {
     this.start = start;
     this.end= end;
     this.index = index;
 }
    
}
class Solution {
    public static ArrayList<Integer> maxMeetings(int n, int[] start, int[] end) {
        // code here
        ArrayList<Pair> list = new ArrayList();


for(int i =0 ; i < n ; i++)
{
list.add(new Pair(start[i],end[i] ,i+1));

}
Comparator<Pair> comp = (a,b)->a.end-b.end;
Collections.sort(list,comp);

        
        
     ArrayList<Integer>ans = new ArrayList();
     ans.add((list.get(0).index));
        int lastEnd = list.get(0).end;
        for(int i=1 ; i<n ; i++)
        {
            if(list.get(i).start>lastEnd)
            {
                
                lastEnd=list.get(i).end;
                ans.add(list.get(i).index);
            }
        }
        Collections.sort(ans);
        return ans;
    }
}
        

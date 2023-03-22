class Solution {
    public int largestRectangleArea(int[] heights) {
       
        /*
        // Two Pass Solution 
        
        int n = heights.length;
        int[] leftsmall = new int[n]; // for calculating left smaller elements =>boundary
        int[] rightsmall = new int[n]; // calculating right small => Boundary
        
        Stack<Integer> st = new Stack();
        // calculating left small
        for(int i =0;i<n;i++)
        {
            while(!st.isEmpty() && heights[st.peek()]>=heights[i])
            {
                st.pop();
            }
            if(st.isEmpty()) leftsmall[i]=0;
            else leftsmall[i] =st.peek()+1;
            st.push(i);
            
        }
        // clear stack
        while(!st.isEmpty())
        {
            st.pop();
        }
        // calculate right small
        
         for(int i=n-1;i>=0;i--)
        {
            while(!st.isEmpty() && heights[st.peek()]>=heights[i])
            {
                st.pop();
            }
            if(st.isEmpty()) rightsmall[i]=n-1;
            else rightsmall[i] =st.peek()-1;
            st.push(i);
            
        }
        
        //calculate max height;
        int ans =0;
        for(int i=0;i<n;i++)
        {
            ans = Math.max(ans,((rightsmall[i]-leftsmall[i]+1)*heights[i]));
        }
        return ans;
        */
        
        // one pass solution 
        
        Stack<Integer> st = new Stack();
        
        int n = heights.length;
        int maxA =0;
        for(int i =0 ; i<=n;i++)
        {
            while(!st.isEmpty() && (i==n || heights[st.peek()]>=heights[i]))
            {
                int height = heights[st.peek()];
                st.pop();
                int width=0;
                if(st.isEmpty()) width=i;
                else width = i-st.peek()-1;
                maxA = Math.max(maxA , width*height);
            }
            st.push(i);
        }
        return maxA;
        
        
        
    }
}
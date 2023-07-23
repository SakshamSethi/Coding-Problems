public class Solution {
public int maximalRectangle(char[][] matrix) {
    if(matrix == null || matrix.length == 0 || matrix[0].length == 0) return 0;
    
    int[] height = new int[matrix[0].length];
    for(int i = 0; i < matrix[0].length; i ++){
        if(matrix[0][i] == '1') height[i] = 1;
    }
    
    int result = largestInLine(height);
    for(int i = 1; i < matrix.length; i ++){
        resetHeight(matrix, height, i);
        result = Math.max(result, largestInLine(height));
    }
    
    return result;
}

private void resetHeight(char[][] matrix, int[] height, int idx){
    for(int i = 0; i < matrix[0].length; i ++){
        if(matrix[idx][i] == '1') height[i] += 1;
        else height[i] = 0;
    }
}    

public int largestInLine(int[] heights) {
    if(heights == null || heights.length == 0) return 0;
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
}
}
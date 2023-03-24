class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int nc) {
     
        //Easy DFS
        
        if(image[sr][sc]==nc) return image;
        fill(sr,sc,image[sr][sc],nc,image.length,image[0].length,image);
            return image;
    }
    public void fill(int sr,int sc , int color ,int nc ,int m ,int n,int[][] image)
    {
        if(sr<0 || sr>m-1 || sc<0 || sc>n-1 || image[sr][sc]!=color) return ;
        
        image[sr][sc]=nc;
        
        fill(sr+1,sc,color,nc,m,n,image);
        fill(sr,sc+1,color,nc,m,n,image);
        fill(sr-1,sc,color,nc,m,n,image);
        fill(sr,sc-1,color,nc,m,n,image);
        
    }
}
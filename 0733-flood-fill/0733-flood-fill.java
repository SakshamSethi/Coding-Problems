class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
     
         if(image[sr][sc]==color) return image;
          dfs(image,sr,sc,image[sr][sc],color);
      return image;
    }
  void dfs(int[][]image,int sr , int sc , int color,int ncolor)
  {
    if(sr<0 || sr>image.length-1 || sc<0 || sc>image[0].length-1||image[sr][sc]!=color) return;
    
    image[sr][sc]=ncolor;
    
    dfs(image,sr+1,sc,color,ncolor);
    dfs(image,sr,sc-1,color,ncolor);
    dfs(image,sr-1,sc,color,ncolor);
    dfs(image,sr,sc+1,color,ncolor);
    return;
  }
}
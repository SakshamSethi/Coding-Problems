class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int i =0 ; i<image.length ; i++)
        {
            int[] temp  = new int[image[i].length] ;
            for(int j =0 ;j<image[i].length;j++)
            {
                
                temp[j]=image[i][j]^1;
            }
            for(int j =0 ;j<image[i].length;j++)
            {
                image[i][j]=temp[(image[i].length-1)-j];
            }
        }
     

    return image;
    }
}
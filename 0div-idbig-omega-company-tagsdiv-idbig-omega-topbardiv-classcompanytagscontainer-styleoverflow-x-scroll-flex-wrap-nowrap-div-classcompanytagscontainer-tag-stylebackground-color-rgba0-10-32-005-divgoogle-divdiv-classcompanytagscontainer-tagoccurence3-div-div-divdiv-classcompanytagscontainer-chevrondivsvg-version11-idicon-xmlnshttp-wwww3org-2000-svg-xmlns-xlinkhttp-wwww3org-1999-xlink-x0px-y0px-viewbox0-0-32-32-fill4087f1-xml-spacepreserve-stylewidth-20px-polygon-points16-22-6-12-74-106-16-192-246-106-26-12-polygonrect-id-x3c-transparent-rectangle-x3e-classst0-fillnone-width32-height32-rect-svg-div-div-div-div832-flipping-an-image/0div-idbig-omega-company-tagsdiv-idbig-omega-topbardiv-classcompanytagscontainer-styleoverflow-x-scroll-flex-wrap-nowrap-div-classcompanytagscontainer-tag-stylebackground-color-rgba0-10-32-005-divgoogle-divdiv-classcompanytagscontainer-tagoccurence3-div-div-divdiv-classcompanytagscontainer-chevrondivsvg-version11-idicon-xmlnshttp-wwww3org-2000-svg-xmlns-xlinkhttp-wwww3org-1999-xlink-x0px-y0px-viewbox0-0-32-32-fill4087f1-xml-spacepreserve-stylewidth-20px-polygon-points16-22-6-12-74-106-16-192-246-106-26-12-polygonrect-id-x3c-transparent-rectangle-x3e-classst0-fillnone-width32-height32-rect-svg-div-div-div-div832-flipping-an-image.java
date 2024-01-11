class Solution {
    public int[][] flipAndInvertImage(int[][] images) {
        
        int n = images[0].length;
        for(int[] image : images)
        {
            for(int i=0 ; i<(n/2) ; i++)
            { 
                
                int temp = image[i];
                image[i] = image[n-1-i];
                image[n-1-i] = temp;
            }
            for(int i =0 ; i< n ;i++)
            {
                if(image[i]==1) image[i]=0;
                else image[i]=1;
            }
        }
        return images;
    }
}
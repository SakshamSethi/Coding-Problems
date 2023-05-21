class Solution {
    public void sortColors(int[] arr) {
        
        // Brute force - Insertion Sort or any other sorting
        /*
         int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
 
    
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }*/
        
        // Better Approach
        // using counters
        
        int c1 =0 ,c2=0,c3=0;

        for(int x:arr)
        {
            if(x==0)c1++;
            if(x==1)c2++;
            if(x==2)c3++;
        }
int i=0;
        while(c1>0) 
        {arr[i++] = 0;
        c1--;
        }
         while(c2>0) {arr[i++] = 1; c2--;}
        while(c3>0) {arr[i++] = 2; c3--;}
    
    }
            
        }
    
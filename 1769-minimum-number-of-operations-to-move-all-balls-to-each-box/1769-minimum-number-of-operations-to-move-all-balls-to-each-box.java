class Solution {
    public int[] minOperations(String boxes) {
        char[] arr= boxes.toCharArray();
        int ans[] = new int[arr.length];
        
     for(int i=0;i<arr.length;i++)
     {
         int count = 0;
         for(int j=0;j<arr.length;j++)
         {
             if(i==j)continue;
             
             if(arr[j]=='0') continue;
             
             count+=Math.abs(j-i);
             
         }
         ans[i]=count;
     }
        return ans;
    }
}
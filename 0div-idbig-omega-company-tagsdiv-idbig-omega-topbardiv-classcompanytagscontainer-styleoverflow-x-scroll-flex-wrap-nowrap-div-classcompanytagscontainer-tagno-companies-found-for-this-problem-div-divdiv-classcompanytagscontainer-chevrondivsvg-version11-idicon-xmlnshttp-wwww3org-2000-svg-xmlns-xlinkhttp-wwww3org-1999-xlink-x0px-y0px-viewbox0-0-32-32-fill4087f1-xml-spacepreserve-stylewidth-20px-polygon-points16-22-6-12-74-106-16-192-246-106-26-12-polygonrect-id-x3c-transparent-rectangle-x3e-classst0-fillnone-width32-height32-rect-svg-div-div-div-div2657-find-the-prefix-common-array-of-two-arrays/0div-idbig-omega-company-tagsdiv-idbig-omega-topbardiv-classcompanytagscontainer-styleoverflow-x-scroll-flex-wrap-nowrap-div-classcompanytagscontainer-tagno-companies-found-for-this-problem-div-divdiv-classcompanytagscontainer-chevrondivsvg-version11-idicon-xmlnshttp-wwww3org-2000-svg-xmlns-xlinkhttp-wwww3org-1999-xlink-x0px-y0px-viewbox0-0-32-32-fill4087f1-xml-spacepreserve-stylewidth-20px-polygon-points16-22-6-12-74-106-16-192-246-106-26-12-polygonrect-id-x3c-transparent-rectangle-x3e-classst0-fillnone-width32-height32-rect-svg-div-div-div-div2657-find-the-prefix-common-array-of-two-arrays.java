class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        
        int n = A.length;
        int[]C = new int[n];
        
        HashMap<Integer,Integer> hmap = new HashMap();
        
        int count = 0;
        for(int i=0 ; i< n ; i++)
        {
            hmap.put(A[i], hmap.getOrDefault(A[i],0)+1);
             if(hmap.get(A[i])==2)count++;
            hmap.put(B[i], hmap.getOrDefault(B[i],0)+1);
            
           
            if(hmap.get(B[i])==2)count++;
            
            C[i] = count;
        }
        return C;        
    }
}
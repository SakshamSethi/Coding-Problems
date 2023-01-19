class Solution {
    public int[] fairCandySwap(int[] A, int[] B) {
        
        int sa=0,sb=0;
        for(int x : A) sa+=x;
        for(int x : B) sb+=x;
        
        int d = sb-sa;
        d=d/2;
        
        Set<Integer> S = new HashSet<>();
        
        for(int x: B)
            S.add(x);
        
        for(int x : A)
        {
            if(S.contains(x+d))
            {
                return new int[]{x,x+d};
            }
        }
        
        return null;
        
        
    }
}
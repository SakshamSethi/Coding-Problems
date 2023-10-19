class Solution {
    public int numTilePossibilities(String tiles) {
        
        Set<String> set = new HashSet<>(); 
        boolean[]vis = new boolean[tiles.length()];
        Arrays.fill(vis,false);
        
         compute(tiles , "" , set,vis);
        return set.size()-1;
        
    }
    void compute(String tiles , String fixed , Set<String>set , boolean[]vis )
    {
       set.add(fixed);
      
        
        
        for(int i = 0 ; i<tiles.length();i++)
        {
            if(!vis[i])
            {
                vis[i]=true ;
                compute(tiles,fixed+tiles.charAt(i),set,vis);
                vis[i]=false;
            }
        }
    }
}
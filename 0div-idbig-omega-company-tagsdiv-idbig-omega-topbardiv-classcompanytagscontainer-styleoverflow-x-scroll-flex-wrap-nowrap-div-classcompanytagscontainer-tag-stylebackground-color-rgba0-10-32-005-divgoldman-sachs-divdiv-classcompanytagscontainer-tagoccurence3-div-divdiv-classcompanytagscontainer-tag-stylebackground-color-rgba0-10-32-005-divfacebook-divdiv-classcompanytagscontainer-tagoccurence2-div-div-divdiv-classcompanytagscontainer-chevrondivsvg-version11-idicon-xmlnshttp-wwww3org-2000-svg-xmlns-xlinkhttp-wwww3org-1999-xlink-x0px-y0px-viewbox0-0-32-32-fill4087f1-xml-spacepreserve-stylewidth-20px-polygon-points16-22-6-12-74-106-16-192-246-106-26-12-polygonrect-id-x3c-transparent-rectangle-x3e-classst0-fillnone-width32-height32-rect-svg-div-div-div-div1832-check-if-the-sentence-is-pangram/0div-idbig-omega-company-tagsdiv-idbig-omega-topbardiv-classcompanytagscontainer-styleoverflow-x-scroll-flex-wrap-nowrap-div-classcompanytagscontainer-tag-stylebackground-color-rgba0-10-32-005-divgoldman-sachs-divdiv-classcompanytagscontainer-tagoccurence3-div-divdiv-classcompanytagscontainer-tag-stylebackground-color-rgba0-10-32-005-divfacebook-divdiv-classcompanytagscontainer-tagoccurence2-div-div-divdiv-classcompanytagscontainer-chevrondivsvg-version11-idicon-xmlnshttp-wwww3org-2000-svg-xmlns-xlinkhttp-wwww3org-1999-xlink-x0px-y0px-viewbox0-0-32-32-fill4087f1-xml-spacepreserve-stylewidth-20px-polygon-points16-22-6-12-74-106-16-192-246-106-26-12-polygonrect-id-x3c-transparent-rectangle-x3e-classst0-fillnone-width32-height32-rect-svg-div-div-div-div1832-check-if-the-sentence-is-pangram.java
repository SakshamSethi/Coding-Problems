class Solution {
    public boolean checkIfPangram(String sentence) {
        int[] arr = new int[26];
            
            for(char x : sentence.toCharArray())
            {
                arr[(int)(x-'a')]++;
            }
            
        for(int x: arr) if(x==0)return false;
        return true;
    }
}
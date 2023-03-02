public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        
        int result =0;  int lsb = 1;
        for(int i=0;i<32;i++)
        {
         lsb=1;  
            lsb = n&1;
           
          
            result= result|(lsb<<(32-i-1));
              n=n>>1;
        }
        return result;
    }
}
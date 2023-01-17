/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        
     
       int s = 1;
        int e = n;
   
       int m=0;
        
        while(s<=e)
        {
           m = s+(e-s)/2;
            
            if(guess(m) == 0)
               return m;
            if(guess(m)==-1)
                e=m-1;
            if(guess(m)==1)
                s=m+1;
            
        }
     
        return -1;
    }
}
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
      
      int s =1;
      int e = n;
      
      while(s<=e)
      {
        int mid = s +(e-s)/2;
        
        int guessedNumber = guess(mid);
        
        if(guessedNumber==0) return mid ;
        
        else if(guessedNumber==-1)e = mid-1;
        
        else s= mid +1 ;
        
      }
        return 0;
      
    }
}
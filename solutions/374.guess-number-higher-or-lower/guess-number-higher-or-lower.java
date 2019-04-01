/* The guess API is defined in the parent class GuessGame.
   @param num, your guess
   @return -1 if my number is lower, 1 if my number is higher, otherwise return 0
      int guess(int num); */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        
        return guessNumberAux(1,n);

    }
    
     public int guessNumberAux(int l,int r) {
         
        if(l>r)
            return -1;
         
         int mid = l + (r-l)/2;
         
        if(guess(mid)==0)
            return mid;
        else if(guess(mid)>0)
            return guessNumberAux(mid+1,r);
        else
            return guessNumberAux(l,mid-1);
        
     }
}
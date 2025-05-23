class Solution {
    public boolean isPowerOfFour(int n) {
    //    return n > 0 && Integer.bitCount(n) == 1 && (n-1) % 3 == 0;

    if(n==1){
            return true;
        }
        if(n%4!=0 || n==0){
            return false;
        }
        return isPowerOfFour(n/4);   
    }
}

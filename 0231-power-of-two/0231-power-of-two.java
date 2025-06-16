class Solution {
    public boolean isPowerOfTwo(int n) {
        //If n is less than or equal to 0, it can't be a power of two
        if(n<=0) return false;

        // A power of two has only one bit set in binary.
        // (n & (n - 1)) == 0 checks if exactly one bit is set.
        return (n & (n-1)) == 0;

    }
}
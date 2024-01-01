class Solution {
    public int mySqrt(int x) {
        long l  = 1, r = x;
        while(l <= r) {
            long m = (l + r) / 2;
            long val = m * m;
            if(val <= x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return (int)r;
    }
}

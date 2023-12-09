class Solution {
    public boolean isHappy(int n) {

        while (n > 9) {
            n = IsHappy(n);
        }
        if (n == 1 || n == 7)
            return true;
        else
            return false;
    }

    public static int IsHappy(int n) {
        int s = 0;
        while (n != 0) {
            int d = n % 10;
            s += (d * d);
            n /= 10;
        }
        return s;
    }
}
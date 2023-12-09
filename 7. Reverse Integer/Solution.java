class Solution {
    public int reverse(int x) {
        long rev=0, d=0;
        int k=x;
        while(k!=0)
        {
            d=x%10;
            rev=rev*10+d;
            x=x/10;
            k=k/10;
        }
     if(rev<Math.pow(-2,31) || rev>Math.pow(2,31) )
            return 0;
        else 
            return (int)rev;
    }
}
class Solution {
    public boolean isPalindrome(int x)
     {
        int r=0,c=x;
        if(x>=0)
        {    while(x!=0)
            {
                int d=x%10;
                r=r*10+d;
                x/=10;
            }
            if(r==c)
            return true;
        }
        return false;
    }
}
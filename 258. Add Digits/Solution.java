class Solution {
    public int addDigits(int num) {
        int s;
        while(num>9)
        {
            s=0;
            while(num!=0)
            {
                int d=num%10;
                s+=d;
                num/=10;
            }
            num=s;
        }
        return num;
    }
}
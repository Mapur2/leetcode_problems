class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> a=new ArrayList<>();
        while(left<=right)
        {
            if(left<10)
                a.add(left);
            else
            {
                int n=left;
                while(n!=0)
                {
                    int d=n%10;
                    if(d==0 || left%d!=0)
                        break;
                    n/=10;
                }
                if(n==0)
                    a.add(left);
            }
            left++;
        }
        return a;
    }
}
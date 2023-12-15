class Solution {
    public int maxProduct(int[] nums) {
        int i,j,s=0,ss=0, n=nums.length;
        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
                s=(nums[i]-1)*(nums[j]-1);
                if(s>ss)
                    ss=s;
            }
        }
        return ss;
    }
}
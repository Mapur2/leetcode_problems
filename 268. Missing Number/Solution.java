class Solution {
    public int missingNumber(int[] nums) {
       
        int n=nums.length,c=0,s=0;
        for(int i=0;i<=n;i++)
        {
            s=s+i;
        }
        for(int j=0;j<n;j++)
        c+=nums[j];
        return s-c;
    }
}
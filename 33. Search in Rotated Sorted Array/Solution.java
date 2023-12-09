class Solution {
    public int search(int[] nums, int target) {
        int ch=0,ll,ul,n=nums.length;
        if(n==1)
        {
            if(nums[0]==target)
            ch=0;
            else ch=-1;
        }
        else
        {
            for(int i=0;i<n;i++)
            {
                if(nums[i]==target)
                return i;
            }
            return -1;
        }
        return ch;
    }
}
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int p1=-1,p2=-1;
        int i,a[]=new int[2];
        for(i=0;i<nums.length;i++)
        {
            if(target==nums[i])
            {
                p1=i;
                break;
            }
        }
        if(p1==-1)
            {
                a[0]=-1;
                a[1]=-1;
                return a;
            }
        for(i=nums.length-1;i>=0;i--)
        {
            if(nums[i]==target)
            {
                p2=i;
                break;
            }
        }
        a[0]=p1;
        a[1]=p2;
        return a;
    }
}
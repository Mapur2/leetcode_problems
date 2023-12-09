class Solution {
    public int searchInsert(int[] nums, int target) {
        int i,l=nums.length;
        for(i=0;i<l;i++)
        {
            if(nums[i]==target)
            return i;
        }
        if(target>nums[l-1])
        return l;
        else if(target<nums[0])
        return 0;
        else
        {
            for(i=0;i<l-1;i++)
            {
                if(nums[i]<target && nums[i+1]>target)
                l=i+1;
            }
        }
        return l;
    }
}
class Solution {
    public int removeDuplicates(int[] nums) {
        int j;
        for(int i=1;i<nums.length;i++)
        {
            j=i;
            while(j>0 && nums[j-1]>nums[j])
            {
                nums[j-1]=(nums[j-1]+nums[j])-nums[j];
                nums[j]=(nums[j-1]+nums[j])-nums[j-1];
                j--;
            }
        }
        int k,l=0;
        for(k=1;k<nums.length;k++)
        {
            if(nums[k]!=nums[l])
            nums[++l]=nums[k];
        }
        return l+1;
    }

}
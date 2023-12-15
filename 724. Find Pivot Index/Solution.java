class Solution {
    public int pivotIndex(int[] nums) {
        int i,j,k,n=nums.length;
        for(k=0;k<n;k++)
        {
            i=0;j=n-1;
            int s=0,p=0;
            while(i!=k)
            {
                s+=nums[i];
                i++;
            }
            while(j!=k)
            {
                p+=nums[j];
                j--;
            }
            if(p==s)
                return k;
        }
        return -1;
    }
}